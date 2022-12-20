package com.spring.spring_data_projection.dto;

public interface BookSlim {
    Long getId();

    String getTitle();

    AuthorWithId getAuthor();

    interface AuthorWithId {
        Long getId();
    }
}
