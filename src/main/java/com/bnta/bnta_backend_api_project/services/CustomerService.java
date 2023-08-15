package com.bnta.bnta_backend_api_project.services;

import com.bnta.bnta_backend_api_project.controllers.CustomerController;
import com.bnta.bnta_backend_api_project.models.Customer;
import com.bnta.bnta_backend_api_project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() {
        return this.customerRepository.findAll();
    }

    public Customer findCustomer(Long id) {
        return this.customerRepository.findById(id).get();
    }
}
