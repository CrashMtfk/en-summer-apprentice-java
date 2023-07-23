package com.practica.backjava.dtos;

import com.practica.backjava.entities.TicketCategory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TicketCategoryDTO {
    private BigDecimal ticketPrice;
    private String ticketDescription;
    private int ticketCategoryID;
    private Integer eventID;

    public TicketCategoryDTO(TicketCategory ticketCategory) {
        this.ticketPrice = ticketCategory.getTicketPrice();
        this.ticketDescription = ticketCategory.getTicketDescription();
        this.ticketCategoryID = ticketCategory.getTicketCategoryID();
        this.eventID = ticketCategory.getEvent().getEventID();
    }
}
