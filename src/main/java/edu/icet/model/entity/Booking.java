package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;
    private Date sheduleDate;

    @OneToOne(cascade = CascadeType.ALL)
    Candidate candidate;

    @OneToOne
    Slot slot;

}
