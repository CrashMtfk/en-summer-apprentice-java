package com.practica.backjava.services;

import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.repositories.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService{
    private TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryServiceImpl(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public List<TicketCategory> getAllTicketCategory() {
        return (List<TicketCategory>) ticketCategoryRepository.findAll();
    }

    public TicketCategory getTicketById(Integer ticketCategoryID){
        return ticketCategoryRepository.findByTicketCategoryID(ticketCategoryID);
    }
}
