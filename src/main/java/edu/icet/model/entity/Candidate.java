package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Candidate {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String contactNo;

}
