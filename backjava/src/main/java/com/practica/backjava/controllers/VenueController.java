package com.practica.backjava.controllers;

import com.practica.backjava.entities.Venue;
import com.practica.backjava.services.VenueServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenueController {
    private VenueServiceImpl venueService;

    public VenueController(VenueServiceImpl venueService) {
        this.venueService = venueService;
    }

    @GetMapping("/api/venues")
    public List<Venue> getAllVenues(){
        return venueService.getVenues();
    }
}
