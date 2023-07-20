package com.practica.backjava.controllers;

import com.practica.backjava.entities.TicketCategory;
import com.practica.backjava.services.TicketCategoryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketCategoryController {
    private TicketCategoryServiceImpl ticketCategoryService;

    public TicketCategoryController(TicketCategoryServiceImpl ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/api/all_ticket_category")
    public List<TicketCategory> getAllTicketCategory(){
        return ticketCategoryService.getAllTicketCategory();
    }
}
