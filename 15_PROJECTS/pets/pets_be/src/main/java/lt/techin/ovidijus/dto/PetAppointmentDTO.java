package lt.techin.ovidijus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lt.techin.ovidijus.enums.Status;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetAppointmentDTO {

    private Long appointmentId;
    private Long userId;
    private String petOwner;
    private String petName;
    private LocalDate date;
    private LocalTime time;
    private String notes;
    private Status status;
}
