package com.practica.backjava.dtos;

import com.practica.backjava.entities.TicketCategory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

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

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }
}
