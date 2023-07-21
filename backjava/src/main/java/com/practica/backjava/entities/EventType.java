package com.practica.backjava.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventTypeID")
    private Integer eventyTypeID;

    @Column(name = "EventTypeName")
    private String eventTypeName;

    public EventType() {
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventyTypeID=" + eventyTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }

    public Integer getEventyTypeID() {
        return eventyTypeID;
    }

    public void setEventyTypeID(Integer eventyTypeID) {
        this.eventyTypeID = eventyTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
