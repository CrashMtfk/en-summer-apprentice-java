package com.practica.backjava.controllers;

import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.Order;
import com.practica.backjava.services.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

}
