package com.practica.backjava.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventTypeID")
    private int eventyTypeID;

    @Column(name = "EventTypeName")
    private String eventTypeName;

    @OneToMany(mappedBy = "eventType")
    private List<Event> eventList;

    public EventType() {
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventyTypeID=" + eventyTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                ", eventList=" + eventList +
                '}';
    }
}
