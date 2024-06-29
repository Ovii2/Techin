package lt.techin.ovidijus.repository;

import lt.techin.ovidijus.model.PetAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetAppointmentRepository extends JpaRepository<PetAppointment, Long> {

    List<PetAppointment> findByUserId(Long userId);
}
