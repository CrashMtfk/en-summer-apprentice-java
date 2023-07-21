package com.practica.backjava.controllers;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.entities.Event;
import com.practica.backjava.mappers.EventStructMapper;
import com.practica.backjava.repositories.EventRepository;
import com.practica.backjava.services.EventServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    private EventServiceImpl eventService;
    private EventStructMapper eventStructMapper;
    private EventRepository eventRepository;

    public EventController(EventServiceImpl eventService, EventStructMapper eventStructMapper, EventRepository eventRepository) {
        this.eventService = eventService;
        this.eventStructMapper = eventStructMapper;
        this.eventRepository = eventRepository;
    }

    @GetMapping("/api/event/{id}")
    public ResponseEntity<EventDTO> getEvents(@PathVariable Integer id){
        return new ResponseEntity<>(eventStructMapper.eventToEventDto(eventRepository.findById(id).get()), HttpStatus.OK);
    }
    @GetMapping("/api/event")
    public List<Event> getEventByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType){
        return eventService.getEventByValueIdAndEventType(venueID, eventType);
    }
}
