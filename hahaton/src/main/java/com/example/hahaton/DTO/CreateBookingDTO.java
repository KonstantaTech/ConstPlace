package com.example.hahaton.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingDTO implements Serializable {

    private Long placeId;

    private Date booked_from;
    private Date booked_to;
}
