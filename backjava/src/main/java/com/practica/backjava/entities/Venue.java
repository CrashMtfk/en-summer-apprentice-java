package com.practica.backjava.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VenueID")
    private int venueID;

    @Column(name = "Location")
    private String venueLocation;

    @Column(name = "Type")
    private String venueType;

    @Column(name = "Capacity")
    private int venueCapacity;

    @OneToMany(mappedBy = "venue")
    private List<Event> eventList;

    public Venue() {
    }

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
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

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", venueLocation='" + venueLocation + '\'' +
                ", venueType='" + venueType + '\'' +
                ", venueCapacity=" + venueCapacity +
                ", eventList=" + eventList +
                '}';
    }
}
