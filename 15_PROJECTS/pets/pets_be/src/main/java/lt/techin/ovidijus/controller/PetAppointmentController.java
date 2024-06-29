package lt.techin.ovidijus.controller;

import lt.techin.ovidijus.dto.PetAppointmentDTO;
import lt.techin.ovidijus.exceptions.PetNotFoundException;
import lt.techin.ovidijus.model.PetAppointment;
import lt.techin.ovidijus.service.PetAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pets")
public class PetAppointmentController {

    private PetAppointmentService petAppointmentService;

    @Autowired
    public PetAppointmentController(PetAppointmentService petAppointmentService) {
        this.petAppointmentService = petAppointmentService;
    }

    @GetMapping
    public ResponseEntity<List<PetAppointment>> getAllPetAppointments() {
        List<PetAppointment> appointments = petAppointmentService.getAllPetAppointments();
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<PetAppointment> createNewPetAppointment(@RequestBody PetAppointmentDTO petAppointmentDTO) {
        PetAppointment newAppointment = petAppointmentService.createNewPetAppointment(petAppointmentDTO);
        return new ResponseEntity<>(newAppointment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deletePetAppointment(@PathVariable long id) throws PetNotFoundException {
        petAppointmentService.deletePetAppointment(id);
    }


    @PatchMapping("/{id}")
    public ResponseEntity<PetAppointment> updatePetAppointment(@PathVariable long id, @RequestBody PetAppointment petAppointment) {
        try {
            PetAppointment updatedAppointment = petAppointmentService.updatePetAppointment(id, petAppointment);
            return new ResponseEntity<>(updatedAppointment, HttpStatus.OK);
        } catch (PetNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/status/{id}")
    public ResponseEntity<PetAppointment> updatePetStatus(@PathVariable Long id) throws PetNotFoundException {
        petAppointmentService.updatePetStatus(id);
        return ResponseEntity.ok().build();
    }
}
