package com.spring.spring_data_projection.service;

import com.spring.spring_data_projection.entity.Author;
import java.util.List;

public interface AuthorService {

    Author createOne(Author author);

    List<Author> getAll();

}
