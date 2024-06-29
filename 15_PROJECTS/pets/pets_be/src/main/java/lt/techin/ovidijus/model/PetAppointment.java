package lt.techin.ovidijus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lt.techin.ovidijus.enums.Status;


import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "pet_appointments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PetAppointment {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long id;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "notes")
    private String notes;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status = Status.PENDING;

}
