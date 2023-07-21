package com.practica.backjava.repositories;

import com.practica.backjava.entities.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository  extends JpaRepository<TicketCategory,Integer> {
    TicketCategory findByTicketCategoryID(Integer ticketCategoryID);
}
