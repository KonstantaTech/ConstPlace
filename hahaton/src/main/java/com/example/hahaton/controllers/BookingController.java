package com.example.hahaton.controllers;

import com.example.hahaton.DTO.CreateBookingDTO;
import com.example.hahaton.services.bookingService.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PutMapping("/save")
    private void createNewBooking(Principal principal, @RequestBody CreateBookingDTO dto){
        bookingService.addNewBooking(principal.getName(), dto);
    }
}
