package com.practica.backjava.dtos;

import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.TicketCategory;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDTO {
    private int eventID;
    private int orderTicketCategoryID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getOrderTicketCategoryID() {
        return orderTicketCategoryID;
    }

    public void setOrderTicketCategoryID(int orderTicketCategoryID) {
        this.orderTicketCategoryID = orderTicketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
