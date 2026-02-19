package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

    @ManyToMany
    private Interviewer interviewer;


}
