package com.example.hahaton.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "office")
@AllArgsConstructor
@NoArgsConstructor
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long officeId;

    @Column(name = "office_address")
    private String officeAddress;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private Organisation company;

    @OneToMany(mappedBy = "office")
    private Collection<Place> places;
}
