package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Slot {

    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private String timeSlot;
    private boolean isAvailable;

    @ManyToOne
    private Interviewer interviewer;



}
