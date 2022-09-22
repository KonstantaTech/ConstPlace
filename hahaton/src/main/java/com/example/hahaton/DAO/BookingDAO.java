package com.example.hahaton.DAO;

import com.example.hahaton.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Long> {

}
