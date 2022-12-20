package com.spring.spring_data_projection.service;

import com.spring.spring_data_projection.dto.BookSlimDTO;
import com.spring.spring_data_projection.dto.BookSlimWithVerId;
import com.spring.spring_data_projection.entity.Book;

import java.util.List;

public interface BookService {

    Book createOne(Book book);

    List<Book> getAll();

    List<BookSlimWithVerId> getAllWithSlim();

    BookSlimDTO getOneWithDTO();
}
