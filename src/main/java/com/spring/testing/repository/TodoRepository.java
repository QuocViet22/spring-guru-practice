package com.spring.testing.repository;

import com.spring.testing.models.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> findAll();

    Todo findById(int id);
}
