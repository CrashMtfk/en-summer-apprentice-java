package com.practica.backjava.controllers;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.services.EventServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }
    @GetMapping("/events")
    public List<EventDTO> getEventByVenueIdAndEventType(@RequestParam Integer venueID, @RequestParam String eventType){
        return eventService.getEventByVenueIdAndEventType(venueID,eventType);
    }
}
