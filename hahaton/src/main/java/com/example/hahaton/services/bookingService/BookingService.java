package com.example.hahaton.services.bookingService;

import com.example.hahaton.DTO.CreateBookingDTO;

public interface BookingService {

    void addNewBooking(String userEmail, CreateBookingDTO dto);
}
