package com.practica.backjava.services;
import com.practica.backjava.entities.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getOrders();

    public List<Order> getCustomerOrderById(Integer id);
}
