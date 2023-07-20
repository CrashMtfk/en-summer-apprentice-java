package com.practica.backjava.services;

import com.practica.backjava.entities.Venue;
import com.practica.backjava.repositories.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService{
    private VenueRepository venueRepository;

    public VenueServiceImpl(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<Venue> getVenues() {
        return (List<Venue>)venueRepository.findAll();
    }
}
