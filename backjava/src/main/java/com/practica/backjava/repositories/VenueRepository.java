package com.practica.backjava.repositories;

import com.practica.backjava.entities.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends CrudRepository<Venue,Integer> {
}
