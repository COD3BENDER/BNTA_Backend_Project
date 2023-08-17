package com.bnta.bnta_backend_api_project.services;

import com.bnta.bnta_backend_api_project.models.Customer;
import com.bnta.bnta_backend_api_project.models.Orders;
import com.bnta.bnta_backend_api_project.repositories.CustomerRepository;
import com.bnta.bnta_backend_api_project.repositories.OrdersRepository;
import jakarta.persistence.criteria.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    OrdersRepository ordersRepository;


    public List<Orders> findAllOrders() {
        return this.ordersRepository.findAll();
    }

    public Customer findOrder(Long id) {
        return this.customerRepository.findById(id).get();
    }

                                    //example order 1, customer 3
    public Orders addOrderToCustomer(Long ordersId, Long customerId) {
        Orders orderToLink = ordersRepository.findById(ordersId).get(); //1st order // retrieves the order we want

        Customer customer = customerRepository.findById(customerId).get(); // 3rd customer
        orderToLink.setCustomer(customer);
        orderToLink.setOrderDateTime(LocalDateTime.now()); // time the customer will have placed the order
        ordersRepository.save(orderToLink); // save it to database
        return orderToLink;
    }
}
