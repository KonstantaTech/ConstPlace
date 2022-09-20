package com.example.hahaton.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "organisation")
@AllArgsConstructor
@NoArgsConstructor
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long organisationId;

    @Column(name = "legal_address")
    private String legalAddress;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "ownedOrganisation")
    private Collection<User> owners;

    @OneToMany(mappedBy = "company")
    private Collection<Office> offices;
}
