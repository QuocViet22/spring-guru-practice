package com.spring.spring_jpql_query.repository;

import com.spring.spring_jpql_query.dto.OrderResponse;
import com.spring.spring_jpql_query.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//    @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName, COUNT(c.name)) " +
//            "FROM Customer c JOIN c.products p " +
//            "where c.name = ?1")
    @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName, COUNT(c.name)) " +
            "FROM Customer c JOIN c.products p " +
            "where c.name = ?1")
    public List<OrderResponse> getJoinInformation(String name);
}
