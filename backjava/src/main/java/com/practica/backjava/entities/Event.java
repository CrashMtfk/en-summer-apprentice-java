package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private int eventID;

    @OneToMany(mappedBy = "event")
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
    @JsonIgnore
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    @JsonIgnore
    private EventType eventType;

    public Event() {
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
