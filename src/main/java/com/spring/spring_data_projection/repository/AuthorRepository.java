package com.spring.spring_data_projection.repository;

import com.spring.spring_data_projection.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
