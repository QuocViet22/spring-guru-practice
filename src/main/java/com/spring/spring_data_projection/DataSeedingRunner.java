package com.spring.spring_data_projection;

import com.spring.spring_data_projection.entity.Author;
import com.spring.spring_data_projection.entity.Book;
import com.spring.spring_data_projection.service.AuthorService;
import com.spring.spring_data_projection.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeedingRunner implements ApplicationRunner {

    @Autowired
    AuthorService authorService;

    @Autowired
    BookService bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // seed data for author
        Author auth0 = Author.builder()
                .name("Nguyen Van Teo")
                .address("Vietnam")
                .build();
        auth0 = authorService.createOne(auth0);

        // seed data for book
        Book book0 = Book.builder()
                .title("Book of auth0")
                .verboseCode("00123")
                .author(auth0)
                .build();
        bookService.createOne(book0);
    }

}
