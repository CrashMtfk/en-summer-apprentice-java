package com.practica.backjava.services;

import com.practica.backjava.dtos.OrderDTO;
import com.practica.backjava.entities.Customer;
import com.practica.backjava.entities.Order;
import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.mappers.OrderStructMapperImpl;
import com.practica.backjava.repositories.CustomerRepository;
import com.practica.backjava.repositories.OrderRepository;
import com.practica.backjava.repositories.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService{
    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private TicketCategoryRepository ticketCategoryRepository;

    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public List<OrderDTO> getCustomerOrderById(Integer id) {
        List<Order> orderList = orderRepository.findOrderByOrderCustomerID_CustomerID(id);
        return orderList.stream().map(OrderStructMapperImpl::orderToOrderDto).collect(Collectors.toList());
    }

    @Override
    public void saveNewOrder(OrderDTO orderToSave, Integer customerID){
        Order order = new Order();

        TicketCategory orderedTicketCategory = ticketCategoryRepository.findByTicketCategoryID(orderToSave.getOrderTicketCategoryID());
        Customer customer = customerRepository.findByCustomerID(customerID);
        order.setOrderCustomerID(customer);
        order.setOrderTicketCategoryID(orderedTicketCategory);
        order.setOrderedAt(orderToSave.getOrderedAt());
        order.setNumberOfTickets(orderToSave.getNumberOfTickets());
        order.setTotalPrice(orderToSave.getTotalPrice());

        orderRepository.save(order);
    }
}
