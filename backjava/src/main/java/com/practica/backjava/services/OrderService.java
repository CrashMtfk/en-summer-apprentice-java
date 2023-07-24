package com.practica.backjava.services;
import com.practica.backjava.dtos.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getCustomerOrderById(Integer id);
    void saveNewOrder(OrderDTO orderToSave, Integer customerID);
}
