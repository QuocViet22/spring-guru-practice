package com.spring.spring_webflux_reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/all-news", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<News> getAll() {
        return newsService.getItems();
    }
}
