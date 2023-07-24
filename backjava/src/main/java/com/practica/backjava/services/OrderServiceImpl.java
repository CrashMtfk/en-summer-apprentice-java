package com.practica.backjava.services;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.Order;
import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.mappers.OrderStructMapper;
import com.practica.backjava.repositories.CustomerRepository;
import com.practica.backjava.repositories.OrderRepository;
import com.practica.backjava.repositories.TicketCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{
    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private TicketCategoryServiceImpl ticketCategoryService;

    @Override
    public List<OrderDTO> getCustomerOrderById(Integer id) {
        List<Order> orderList = orderRepository.findOrderByOrderCustomerID_CustomerID(id);
        return orderList.stream().map(OrderStructMapper::orderToOrderDto).collect(Collectors.toList());
    }

    @Override
    public OrderDTO saveNewOrder(OrderDTO orderToSave, Integer customerID){
        Order order = new Order();
        TicketCategory ticketCategory = ticketCategoryService.getTicketById(orderToSave.getOrderTicketCategoryID());
        BigDecimal totalPrice = ticketCategory.getTicketPrice().multiply(BigDecimal.valueOf(orderToSave.getNumberOfTickets()));

        Customer customer = customerRepository.findByCustomerID(customerID);
        order.setOrderCustomerID(customer);
        order.setOrderTicketCategoryID(ticketCategory);
        order.setOrderedAt(LocalDateTime.now());
        order.setNumberOfTickets(orderToSave.getNumberOfTickets());
        order.setTotalPrice(totalPrice);

        Order orderSaved = orderRepository.save(order);

        return OrderStructMapper.orderToOrderDto(orderSaved);
    }
}
