package com.practica.backjava.services;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.entities.Event;
import com.practica.backjava.mappers.EventStructMapperImpl;
import com.practica.backjava.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService{
    private EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventDTO> getEventByVenueIdAndEventType(Integer venueID, String eventType) {
        List<Event> events = eventRepository.findEventsByVenueVenueIDAndEventTypeEventTypeName(venueID, eventType);
        return events.stream().map(EventStructMapperImpl::eventToEventDto).collect(Collectors.toList());
    }


}
