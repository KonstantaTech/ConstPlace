package com.example.hahaton.DTO;

import com.example.hahaton.model.Booking;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class UserPersonalPageDTO {

    private String name;
    private String surname;
    private String email;
    private String contactNumber;
    private Collection<Booking> bookings;
}
