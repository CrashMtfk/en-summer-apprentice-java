package com.practica.backjava.dtos;

import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.entities.Venue;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class EventDTO {
    private Integer eventID;
    private Venue venue;
    private String eventTypeName;
    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Set<TicketCategory> ticketCategorySet;
}
