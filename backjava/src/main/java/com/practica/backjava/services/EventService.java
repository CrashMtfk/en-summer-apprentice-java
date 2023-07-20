package com.practica.backjava.services;

import com.practica.backjava.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    public List<Event> getEvents();
    public Optional<Event> getEventById(int id);
}
