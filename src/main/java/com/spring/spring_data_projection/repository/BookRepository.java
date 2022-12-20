package com.spring.spring_data_projection.repository;

import java.util.List;

import com.spring.spring_data_projection.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    <T> List<T> findBy(Class<T> classType);

    // findById with Projection
    <T> T findById(Long id, Class<T> type);
}
