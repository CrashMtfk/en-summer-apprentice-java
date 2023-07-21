package com.practica.backjava.controllers;

import com.practica.backjava.entities.Event;
import com.practica.backjava.services.EventServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    private EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/events")
    public List<Event> getAllEvents(){
        return eventService.getEvents();
    }

    @GetMapping("/api/events/{eventId}")
    public Optional<Event> getEvent(@PathVariable int eventId){
        return eventService.getEventById(eventId);
    }

    @GetMapping("/api/event")
    public List<Event> getEventByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType){
        return eventService.getEventByValueIdAndEventType(venueID, eventType);
    }
}
