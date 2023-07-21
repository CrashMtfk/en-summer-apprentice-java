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



}
