package com.practica.backjava.repositories;

import com.practica.backjava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    public List<Order> findOrderByOrderCustomerID_CustomerID(Integer id);
}
