package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Orders", schema = "dbo")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "CustomerID")
    @JsonBackReference
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
}
