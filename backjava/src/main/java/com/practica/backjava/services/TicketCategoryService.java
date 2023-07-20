package com.practica.backjava.services;

import com.practica.backjava.entities.TicketCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TicketCategoryService {
    public List<TicketCategory> getAllTicketCategory();
}
