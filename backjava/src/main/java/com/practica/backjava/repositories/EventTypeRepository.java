package com.practica.backjava.repositories;

import com.practica.backjava.entities.EventType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends CrudRepository<EventType,Integer> {
}
