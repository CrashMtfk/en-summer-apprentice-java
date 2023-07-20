package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders", schema = "dbo")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "CustomerID")
    @JsonIgnore
    private Customer orderCustomerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID", referencedColumnName = "TicketCategoryID")
    @JsonIgnore
    private TicketCategory orderTicketCategoryID;

    @Column(name = "OrderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "NumberOfTickets")
    private int numberOfTickets;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public Order() {
    }

    public Order(int orderID, Customer orderCustomerID, TicketCategory orderTicketCategoryID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice) {
        this.orderID = orderID;
        this.orderCustomerID = orderCustomerID;
        this.orderTicketCategoryID = orderTicketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getOrderCustomerID() {
        return orderCustomerID;
    }

    public void setOrderCustomerID(Customer orderCustomerID) {
        this.orderCustomerID = orderCustomerID;
    }

    public TicketCategory getOrderTicketCategoryID() {
        return orderTicketCategoryID;
    }

    public void setOrderTicketCategoryID(TicketCategory orderTicketCategoryID) {
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

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderCustomerID=" + orderCustomerID +
                ", orderTicketCategoryID=" + orderTicketCategoryID +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
