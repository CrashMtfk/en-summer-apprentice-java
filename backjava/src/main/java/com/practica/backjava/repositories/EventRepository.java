package com.practica.backjava.repositories;

import com.practica.backjava.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
    List<Event> findEventsByVenueVenueIDAndEventTypeEventTypeName(Integer venueId, String eventType);
}
