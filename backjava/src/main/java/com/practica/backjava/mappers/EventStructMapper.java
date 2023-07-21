package com.practica.backjava.mappers;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.entities.Event;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface EventStructMapper {
    EventDTO eventToEventDto(Event event);
}
