package com.practica.backjava.dtos;

import com.practica.backjava.entities.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerDTO {
    private int customerID;
    private String customerName;
    private String customerEmail;
    private List<Order> orderList;
}
