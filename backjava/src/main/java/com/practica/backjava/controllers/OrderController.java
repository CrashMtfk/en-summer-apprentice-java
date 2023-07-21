package com.practica.backjava.controllers;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.Order;
import com.practica.backjava.mappers.OrderStructMapperImpl;
import com.practica.backjava.services.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/order/{customerID}")
    public List<OrderDTO> getCustomerOrderById(@PathVariable Integer customerID){
        List<Order> orderList = orderService.getCustomerOrderById(customerID);
        return orderList.stream().map(OrderStructMapperImpl::orderToOrderDto).collect(Collectors.toList());
    }

}
