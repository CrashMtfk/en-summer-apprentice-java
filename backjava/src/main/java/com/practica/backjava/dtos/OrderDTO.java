package com.practica.backjava.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class OrderDTO {
    private int eventID;
    private int orderTicketCategoryID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;
}
