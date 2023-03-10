package com.spring.testing.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private String title;
    private String detail;
}
