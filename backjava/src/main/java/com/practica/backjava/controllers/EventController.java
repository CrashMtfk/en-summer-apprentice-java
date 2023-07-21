package com.practica.backjava.controllers;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.entities.Event;
import com.practica.backjava.mappers.EventStructMapperImpl;
import com.practica.backjava.repositories.EventRepository;
import com.practica.backjava.services.EventServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventController {
    private EventServiceImpl eventService;
    private EventRepository eventRepository;

    public EventController(EventServiceImpl eventService, EventRepository eventRepository) {
        this.eventService = eventService;
        this.eventRepository = eventRepository;
    }


    @GetMapping("/api/event")
    public List<EventDTO> getEventByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType){
        List<Event> events = eventService.getEventByValueIdAndEventType(venueID, eventType);
        return events.stream().map(EventStructMapperImpl::eventToEventDto).collect(Collectors.toList());
    }
}
