package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketCategoryID")
    private int ticketCategoryID;

    @Column(name = "TicketDescription")
    private String ticketDescription;

    @Column(name = "Price")
    private BigDecimal ticketPrice;

    @ManyToOne
    @JoinColumn(name = "EventID")
    @JsonBackReference
    private Event event;

    public TicketCategory() {
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", event=" + event +
                '}';
    }
}
