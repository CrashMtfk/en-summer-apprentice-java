package com.practica.backjava.controllers;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.services.OrderServiceImpl;
import com.practica.backjava.services.TicketCategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class OrderController {
    private OrderServiceImpl orderService;
    private TicketCategoryServiceImpl ticketCategoryService;

    public OrderController(OrderServiceImpl orderService, TicketCategoryServiceImpl ticketCategoryService) {
        this.orderService = orderService;
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/orders/{customerID}")
    public List<OrderDTO> getCustomerOrderById(@PathVariable Integer customerID){
        return orderService.getCustomerOrderById(customerID);
    }

    @PostMapping("/order/{customerID}")
    public OrderDTO createNewOrder(@RequestBody OrderDTO orderRequest, @PathVariable Integer customerID){

        return orderService.saveNewOrder(orderRequest, customerID);
    }

}
