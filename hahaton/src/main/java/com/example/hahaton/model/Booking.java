package com.example.hahaton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name = "booking")
@AllArgsConstructor
@NoArgsConstructor
public
class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long booking_id;

    @Column(name = "booked_from")
    private Date booked_from;

    @Column(name = "booked_to")
    private Date booked_to;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;
}
