package com.spring.spring_jpql_query.controller;

import com.spring.spring_jpql_query.dto.OrderRequest;
import com.spring.spring_jpql_query.dto.OrderResponse;
import com.spring.spring_jpql_query.entity.Customer;
import com.spring.spring_jpql_query.repository.CustomerRepository;
import com.spring.spring_jpql_query.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
//        List<OrderResponse> orderResponses = customerRepository.getJoinInformation();
        String name = "abc";
        return customerRepository.getJoinInformation(name);
    }
}
