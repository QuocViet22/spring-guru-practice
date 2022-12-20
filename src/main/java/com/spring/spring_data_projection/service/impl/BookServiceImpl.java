package com.spring.spring_data_projection.service.impl;

import java.util.List;

import com.spring.spring_data_projection.dto.BookSlimDTO;
import com.spring.spring_data_projection.dto.BookSlimWithVerId;
import com.spring.spring_data_projection.entity.Book;
import com.spring.spring_data_projection.repository.BookRepository;
import com.spring.spring_data_projection.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book createOne(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<BookSlimWithVerId> getAllWithSlim() {
        return bookRepository.findBy(BookSlimWithVerId.class);
    }

    @Override
    public BookSlimDTO getOneWithDTO() {
        return bookRepository.findById(1L, BookSlimDTO.class);
    }
}

