package com.practica.backjava.dtos;

import com.practica.backjava.entities.Venue;
import lombok.Getter;
import lombok.Setter;

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

    public Integer getVenueID() {
        return venueID;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }
}
