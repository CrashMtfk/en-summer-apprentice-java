package com.practica.backjava.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VenueDTO {
    private Integer venueID;
    private String venueLocation;
    private String venueType;
    private int venueCapacity;

    public VenueDTO(Integer venueID, String venueLocation, String venueType, int venueCapacity) {
        this.venueID = venueID;
        this.venueLocation = venueLocation;
        this.venueType = venueType;
        this.venueCapacity = venueCapacity;
    }
}
