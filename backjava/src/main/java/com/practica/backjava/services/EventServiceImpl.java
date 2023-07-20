package com.practica.backjava.services;

import com.practica.backjava.entities.Event;
import com.practica.backjava.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService{
    private EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    @Override
    public Optional<Event> getEventById(int id) {
        return eventRepository.findById(id);
    }


}
