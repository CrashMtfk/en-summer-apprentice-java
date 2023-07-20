package com.practica.backjava.repositories;

import com.practica.backjava.entities.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository  extends CrudRepository<TicketCategory,Integer> {
}
