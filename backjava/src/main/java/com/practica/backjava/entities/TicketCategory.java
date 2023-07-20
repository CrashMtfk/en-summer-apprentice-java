package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
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

    @OneToMany(mappedBy = "orderTicketCategoryID")
    private Set<Order> orderSet;

    @ManyToOne
    @JoinColumn(name = "EventID")
    @JsonIgnore
    private Event event;

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, String ticketDescription, BigDecimal ticketPrice, Set<Order> orderSet, Event event) {
        this.ticketCategoryID = ticketCategoryID;
        this.ticketDescription = ticketDescription;
        this.ticketPrice = ticketPrice;
        this.orderSet = orderSet;
        this.event = event;
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

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", orderSet=" + orderSet +
                ", event=" + event +
                '}';
    }
}
