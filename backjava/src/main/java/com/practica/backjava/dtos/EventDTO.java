package com.practica.backjava.dtos;

import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.entities.Venue;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

public class EventDTO {
    private Integer eventID;
    private VenueDTO venue;
    private String eventTypeName;
    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Set<TicketCategory> ticketCategorySet;

    public EventDTO() {
    }

    public EventDTO(Integer eventID, VenueDTO venue, String eventTypeName, String eventDescription, String eventName, LocalDateTime startDate, LocalDateTime endDate, Set<TicketCategory> ticketCategorySet) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventTypeName = eventTypeName;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ticketCategorySet = ticketCategorySet;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public VenueDTO getVenue() {
        return venue;
    }

    public void setVenue(VenueDTO venue) {
        this.venue = venue;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Set<TicketCategory> getTicketCategorySet() {
        return ticketCategorySet;
    }

    public void setTicketCategorySet(Set<TicketCategory> ticketCategorySet) {
        this.ticketCategorySet = ticketCategorySet;
    }
}
