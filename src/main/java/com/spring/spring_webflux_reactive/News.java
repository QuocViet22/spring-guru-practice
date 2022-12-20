package com.spring.spring_webflux_reactive;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class News {
    private String title;
    private String description;
}
