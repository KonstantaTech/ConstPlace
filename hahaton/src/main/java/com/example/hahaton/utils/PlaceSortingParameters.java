package com.example.hahaton.utils;

import lombok.Data;

@Data
public class PlaceSortingParameters {

    private double priceFrom;
    private double priceTo;

    private String city;
    private String placeType;

    private boolean isDayAndNight;

    private byte soundproofing;

    private int placesInOfficeAmount;
    private byte floor;
}
