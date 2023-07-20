package com.practica.backjava.controllers;

import com.practica.backjava.entities.Event;
import com.practica.backjava.services.EventServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/events")
    public List<Event> getEvents(){
        return eventService.getEvents();
    }
}
