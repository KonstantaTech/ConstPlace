package com.example.hahaton.controllers;

import com.example.hahaton.DTO.PlaceRegistrationDTO;
import com.example.hahaton.model.Place;
import com.example.hahaton.services.placeService.PlaceService;
import com.example.hahaton.utils.PlaceSortingParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceService placeService;

    @PutMapping("/addNew")
    private void addNewPlace(@RequestBody PlaceRegistrationDTO dto){
        placeService.saveNewPlace(dto);
    }

    @GetMapping("/sorted")
    private @ResponseBody Collection<Place> getSortedPlaces(@RequestBody PlaceSortingParameters sortingParameters){
        return placeService.getPlacesSortedByParams(sortingParameters);
    }

    @GetMapping("/office/{office_id}")
    private @ResponseBody Collection<Place> getPlacesByOfficeId(@PathVariable("office_id") Long officeId){
        return placeService.getPlacesByOfficeId(officeId);
    }
}
