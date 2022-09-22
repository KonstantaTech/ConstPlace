package com.example.hahaton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Builder
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
}
