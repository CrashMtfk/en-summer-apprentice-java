package com.practica.backjava.mappers;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.Order;

public class OrderStructMapper {
    public static OrderDTO orderToOrderDto(Order order){
        if (order == null) return null;
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderedAt(order.getOrderedAt());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTotalPrice(order.getTotalPrice());
        orderDTO.setEventID(order.getOrderTicketCategoryID().getEvent().getEventID());
        orderDTO.setOrderTicketCategoryID(order.getOrderTicketCategoryID().getTicketCategoryID());

        return orderDTO;
    }
}
