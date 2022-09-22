package com.example.hahaton.services.bookingService;

import com.example.hahaton.DAO.BookingDAO;
import com.example.hahaton.DAO.PlaceDAO;
import com.example.hahaton.DAO.UserDAO;
import com.example.hahaton.DTO.CreateBookingDTO;
import com.example.hahaton.model.Booking;
import com.example.hahaton.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.Principal;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingDAO bookingDAO;
    private final UserDAO userDAO;
    private final PlaceDAO placeDAO;

    @Override
    @Transactional
    public void addNewBooking(String userEmail, CreateBookingDTO dto) {
        User customer = userDAO.findUserByEmail(userEmail);
        Booking booking = Booking.builder()
                .booked_from(dto.getBooked_from())
                .booked_to(dto.getBooked_to())
                .place(placeDAO.findPlaceById(dto.getPlaceId()))
                .build();
        customer.getBookings().add(booking);
        bookingDAO.save(booking);
        userDAO.save(customer);
    }
}
