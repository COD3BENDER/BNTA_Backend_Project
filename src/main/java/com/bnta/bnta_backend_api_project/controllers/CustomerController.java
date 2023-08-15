package com.bnta.bnta_backend_api_project.controllers;

import com.bnta.bnta_backend_api_project.models.Customer;
import com.bnta.bnta_backend_api_project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/customers"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    INDEX
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity(this.customerService.findAllCustomers(), HttpStatus.FOUND);
    }

//    SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable Long id) {
        return new ResponseEntity(customerService.findCustomer(id), HttpStatus.FOUND);
    }

//    CREATE
    @PostMapping
    public ResponseEntity<Customer> postCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.addCustomer(customerDTO);
        return new ResponseEntity(customerService.findAllCustomers(), HttpStatus.CREATED);
    }

}
