package lt.techin.ovidijus.service;

import lt.techin.ovidijus.dto.PetAppointmentDTO;
import lt.techin.ovidijus.enums.Status;
import lt.techin.ovidijus.exceptions.PetNotFoundException;
import lt.techin.ovidijus.model.PetAppointment;
import lt.techin.ovidijus.model.User;
import lt.techin.ovidijus.repository.PetAppointmentRepository;
import lt.techin.ovidijus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PetAppointmentService {

    private final UserRepository userRepository;
    private final UserService userService;
    private PetAppointmentRepository petAppointmentRepository;
    private User user;
    private Status status;

    @Autowired
    public PetAppointmentService(PetAppointmentRepository petAppointmentRepository, UserRepository userRepository, UserService userService) {
        this.petAppointmentRepository = petAppointmentRepository;
        this.userRepository = userRepository;
        this.userService = userService;
    }

//    public List<PetAppointment> getAllPetAppointments() {
//        Optional<User> currentUser = userService.getCurrentUser();
//
//        if (currentUser.isPresent()) {
//            User user = currentUser.get();
//            if (user.getRole().equals("ADMIN")) {
//                return petAppointmentRepository.findAll();
//            }
//            return petAppointmentRepository.findByUserId(user.getId());
//        }
//        throw new RuntimeException("Not authorized");
//    }

    public List<PetAppointment> getAllPetAppointments() {
        User user = userService.getCurrentUser()
                .orElseThrow(() -> new RuntimeException("Not authorized"));

        if (user.getRole().equals("ADMIN")) {
            return petAppointmentRepository.findAll();
        } else {
            return petAppointmentRepository.findByUserId(user.getId());
        }
    }


    public PetAppointment createNewPetAppointment(PetAppointmentDTO petAppointmentDTO) {
        User user = userRepository.findByUserName(petAppointmentDTO.getPetOwner())
                .orElseThrow(() -> new RuntimeException("User not found"));
        PetAppointment newPetAppointment = new PetAppointment();
        newPetAppointment.setOwnerName(petAppointmentDTO.getPetOwner());
        newPetAppointment.setPetName(petAppointmentDTO.getPetName());
        newPetAppointment.setDate(petAppointmentDTO.getDate());
        newPetAppointment.setTime(petAppointmentDTO.getTime());
        newPetAppointment.setNotes(petAppointmentDTO.getNotes());
        newPetAppointment.setStatus(Status.PENDING);
        newPetAppointment.setUser(user);
        return petAppointmentRepository.save(newPetAppointment);
    }

    public void deletePetAppointment(long id) throws PetNotFoundException {
        if (petAppointmentRepository.existsById(id)) {
            petAppointmentRepository.deleteById(id);
        } else {
            throw new PetNotFoundException("Pet not found");
        }
    }

    public PetAppointment updatePetAppointment(long id, PetAppointment petAppointment) throws PetNotFoundException {
        PetAppointment existingPet = petAppointmentRepository.findById(id).orElseThrow(() -> new PetNotFoundException("Pet not found"));
        if (existingPet == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet doesn't exist");
        }
        if (petAppointment.getOwnerName() != null) {
            existingPet.setOwnerName(petAppointment.getOwnerName());
        }
        if (petAppointment.getPetName() != null) {
            existingPet.setPetName(petAppointment.getPetName());
        }
        if (petAppointment.getDate() != null) {
            existingPet.setDate(petAppointment.getDate());
        }
        if (petAppointment.getTime() != null) {
            existingPet.setTime(petAppointment.getTime());
        }
        if (petAppointment.getNotes() != null) {
            existingPet.setNotes(petAppointment.getNotes());
        }
//        if (petAppointment.getStatus() != null) {
//            existingPet.setStatus(petAppointment.getStatus());
//        }
        return petAppointmentRepository.save(existingPet);
    }

    public PetAppointment updatePetStatus(Long id) throws PetNotFoundException {
        PetAppointment petAppointment =
                petAppointmentRepository.findById(id).orElseThrow(() -> new PetNotFoundException("Pet not found"));
        petAppointment.setStatus(Status.APPROVED);
        return petAppointmentRepository.save(petAppointment);
    }
}
