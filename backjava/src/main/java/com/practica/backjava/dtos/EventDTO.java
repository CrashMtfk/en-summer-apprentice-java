package com.practica.backjava.dtos;

import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.entities.Venue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private Integer eventID;
    private VenueDTO venue;
    private String eventTypeName;
    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Set<TicketCategory> ticketCategorySet;
}
