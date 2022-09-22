package com.example.hahaton.services.placeService;

import com.example.hahaton.DTO.PlaceRegistrationDTO;
import com.example.hahaton.model.Place;
import com.example.hahaton.utils.PlaceSortingParameters;

import java.util.Collection;

public interface PlaceService {

    Collection<Place> getPlacesSortedByParams(PlaceSortingParameters sortingParameters);
    void saveNewPlace(PlaceRegistrationDTO dto);
    Collection<Place> getPlacesByOfficeId(Long officeId);
}
