package com.practica.backjava.controllers;

import com.practica.backjava.entities.Customer;
import com.practica.backjava.services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @GetMapping("/api/customers")
    public List<Customer> getCustomers(){
        return customerServiceImpl.getCustomers();
    }
}
