package com.practica.backjava.controllers;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.Order;
import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.mappers.OrderStructMapperImpl;
import com.practica.backjava.services.OrderServiceImpl;
import com.practica.backjava.services.TicketCategoryService;
import com.practica.backjava.services.TicketCategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {
    private OrderServiceImpl orderService;
    private TicketCategoryServiceImpl ticketCategoryService;

    public OrderController(OrderServiceImpl orderService, TicketCategoryServiceImpl ticketCategoryService) {
        this.orderService = orderService;
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/api/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/order/customer/{customerID}")
    public List<OrderDTO> getCustomerOrderById(@PathVariable Integer customerID){
        List<Order> orderList = orderService.getCustomerOrderById(customerID);
        return orderList.stream().map(OrderStructMapperImpl::orderToOrderDto).collect(Collectors.toList());
    }

    @PostMapping("/order/buy/{customerID}")
    public OrderDTO createNewOrder(@RequestBody OrderDTO orderRequest, @PathVariable Integer customerID){
        TicketCategory ticketCategory = ticketCategoryService.getTicketById(orderRequest.getOrderTicketCategoryID());
        BigDecimal numberOfTicketsRequested = BigDecimal.valueOf(orderRequest.getNumberOfTickets());
        BigDecimal totalPrice = ticketCategory.getTicketPrice().multiply(numberOfTicketsRequested);
        LocalDateTime orderedAt = LocalDateTime.now();

        OrderDTO orderToSave = new OrderDTO();
        orderToSave.setEventID(orderRequest.getEventID());
        orderToSave.setOrderTicketCategoryID(orderRequest.getOrderTicketCategoryID());
        orderToSave.setOrderedAt(orderedAt);
        orderToSave.setTotalPrice(totalPrice);
        orderToSave.setNumberOfTickets(orderRequest.getNumberOfTickets());
        orderService.saveNewOrder(orderToSave, customerID);

        return orderToSave;
    }

}
