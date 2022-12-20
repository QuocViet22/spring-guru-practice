package com.spring.testing_with_data.services;

import com.spring.testing_with_data.models.Todo;
import com.spring.testing_with_data.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public int countTodo() {
        return todoRepository.findAll().size();
    }

    public Todo getTodo(int id) {
        return todoRepository.findById(id);
    }

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}

