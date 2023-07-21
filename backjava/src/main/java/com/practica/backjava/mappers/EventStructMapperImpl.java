package com.practica.backjava.mappers;

import com.practica.backjava.dtos.EventDTO;
import com.practica.backjava.entities.Event;
import org.springframework.stereotype.Component;

@Component
public class EventStructMapperImpl implements EventStructMapper{
    @Override
    public EventDTO eventToEventDto(Event event) {
        if(event == null){
            return null;
        }

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventID(event.getEventID());
        eventDTO.setVenue(event.getVenue());
        eventDTO.setEventTypeName(event.getEventType().getEventTypeName());
        eventDTO.setEventDescription(event.getEventDescription());
        eventDTO.setEventName(event.getEventName());
        eventDTO.setStartDate(event.getStartDate());
        eventDTO.setEndDate(event.getEndDate());
        eventDTO.setTicketCategorySet(event.getTicketCategorySet());

        return eventDTO;
    }
}
