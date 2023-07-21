package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private Integer eventID;

    @OneToMany(mappedBy = "event")
    @JsonManagedReference
    private Set<TicketCategory> ticketCategorySet;

    @Column(name = "EventDescription")
    private String eventDescription;

    @Column(name = "EventName")
    private String eventName;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "EndDate")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventType;

    public Event() {
    }

    public Event(Integer eventID, Set<TicketCategory> ticketCategorySet, String eventDescription, String eventName, LocalDateTime startDate, LocalDateTime endDate, Venue venue, EventType eventType) {
        this.eventID = eventID;
        this.ticketCategorySet = ticketCategorySet;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.venue = venue;
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", ticketCategorySet=" + ticketCategorySet +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", venue=" + venue +
                '}';
    }

    public int getEventID() {
        return eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public Set<TicketCategory> getTicketCategorySet() {
        return ticketCategorySet;
    }

    public void setTicketCategorySet(Set<TicketCategory> ticketCategorySet) {
        this.ticketCategorySet = ticketCategorySet;
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

}
