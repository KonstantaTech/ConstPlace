package com.example.hahaton.DAO;

import com.example.hahaton.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Long> {

    @Query("SELECT p from Place p where p.office.officeId = :office_id")
    Collection<Place> findPlacesByOfficeId(@Param("office_id") Long officeId);

    @Query("select p from Place p where p.place_id = :place_id")
    Place findPlaceById(@Param("place_id") Long placeId);

}
