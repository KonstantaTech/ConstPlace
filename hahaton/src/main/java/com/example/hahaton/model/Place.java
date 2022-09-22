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
@Table(name = "place")
@AllArgsConstructor
@NoArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long place_id;

    @Column(name = "place_type")
    private String placeType;

    @Column(name = "price")
    private double price;

    @Column(name = "city")
    private String city;

    @Column(name = "is_day_and_night")
    private boolean isDayAndNight;

    @Column(name = "soundproofing")
    private int soundproofing;

    @Column(name = "places_in_office_amount")
    private int placesInOfficeAmount;

    @Column(name = "floor")
    private int floor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "office_id")
    private Office office;
}
