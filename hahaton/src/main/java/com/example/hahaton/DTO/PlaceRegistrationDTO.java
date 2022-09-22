package com.example.hahaton.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlaceRegistrationDTO {

    private double price;
    private String city;
    private boolean isDayAndNight;
    private int soundproofing;
    private int placesInOfficeAmount;
    private int floor;
    private Long officeId;
    private String placeType;

}
