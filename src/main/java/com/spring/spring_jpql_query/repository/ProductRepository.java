package com.spring.spring_jpql_query.repository;

import com.spring.spring_jpql_query.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
