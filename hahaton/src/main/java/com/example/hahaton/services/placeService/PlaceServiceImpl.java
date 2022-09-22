package com.example.hahaton.services.placeService;

import com.example.hahaton.DAO.OfficeDAO;
import com.example.hahaton.DAO.PlaceDAO;
import com.example.hahaton.DTO.PlaceRegistrationDTO;
import com.example.hahaton.model.Place;
import com.example.hahaton.utils.PlaceSortingParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceDAO placeDAO;
    private final OfficeDAO officeDAO;

    @Override
    public Collection<Place> getPlacesSortedByParams(PlaceSortingParameters sortingParameters) {
        Collection<Place> allPlaces = placeDAO.findAll();
        return allPlaces.stream()
                .filter(place -> place.getPrice() >= sortingParameters.getPriceFrom())
                .filter(place -> place.getPrice() <= sortingParameters.getPriceTo())
                .filter(place -> place.getCity().equals(sortingParameters.getCity()))
                .filter(place -> place.getPlaceType().equals(sortingParameters.getPlaceType()))
                .filter(place -> place.isDayAndNight() == sortingParameters.isDayAndNight())
                .filter(place -> place.getSoundproofing() == place.getSoundproofing())
                .filter(place -> place.getPlacesInOfficeAmount() == sortingParameters.getPlacesInOfficeAmount())
                .filter(place -> place.getFloor() == sortingParameters.getFloor())
                .collect(Collectors.toList());
    }

    @Override
    public void saveNewPlace(PlaceRegistrationDTO dto) {
        Place newPlace = Place.builder()
                .placeType(dto.getPlaceType())
                .price(dto.getPrice())
                .city(dto.getCity())
                .isDayAndNight(dto.isDayAndNight())
                .soundproofing(dto.getSoundproofing())
                .floor(dto.getFloor())
                .office(officeDAO.findOfficeById(dto.getOfficeId()))
                .build();
        placeDAO.save(newPlace);
    }

    @Override
    public Collection<Place> getPlacesByOfficeId(Long officeId) {
        return placeDAO.findPlacesByOfficeId(officeId);
    }
}
