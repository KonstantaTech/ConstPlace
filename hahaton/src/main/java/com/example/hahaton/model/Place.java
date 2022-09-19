package com.example.hahaton.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "place")
@AllArgsConstructor
@NoArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long place_id;

    @Column(name = "place_type")
    @Enumerated(EnumType.STRING)
    private PlaceType placeType;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @OneToMany(mappedBy = "place")
    private Collection<Booking> bookings;
}
