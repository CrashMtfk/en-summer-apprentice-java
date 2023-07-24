package com.practica.backjava.dtos;

import com.practica.backjava.entities.Venue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VenueDTO {
    private Integer venueID;
    private String venueLocation;
    private String venueType;
    private int venueCapacity;

    public VenueDTO(Venue venue) {
        this.venueID = venue.getVenueID();
        this.venueLocation = venue.getVenueLocation();
        this.venueType = venue.getVenueType();
        this.venueCapacity = venue.getVenueCapacity();
    }
}
