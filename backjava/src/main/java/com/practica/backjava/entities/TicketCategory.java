package com.practica.backjava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
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
}
