package com.practica.backjava.services;

import com.practica.backjava.dtos.EventDTO;

import java.util.List;

public interface EventService {

    List<EventDTO> getEventByVenueIdAndEventType(Integer venueID, String eventType);
}
