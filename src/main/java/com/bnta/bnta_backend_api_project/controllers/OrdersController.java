package com.bnta.bnta_backend_api_project.controllers;

import com.bnta.bnta_backend_api_project.models.Customer;
import com.bnta.bnta_backend_api_project.models.Orders;
import com.bnta.bnta_backend_api_project.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/orders"})
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @GetMapping()
    public ResponseEntity<List<Orders>> getAllOrders() {
        return new ResponseEntity(this.ordersService.findAllOrders(), HttpStatus.FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Customer>> getOrder(@PathVariable Long id) {
        return new ResponseEntity(ordersService.findOrder(id), HttpStatus.FOUND);
    }



}
