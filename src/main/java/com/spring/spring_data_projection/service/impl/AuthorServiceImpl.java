package com.spring.spring_data_projection.service.impl;

import java.util.List;

import com.spring.spring_data_projection.entity.Author;
import com.spring.spring_data_projection.repository.AuthorRepository;
import com.spring.spring_data_projection.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author createOne(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
