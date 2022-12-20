package com.spring.spring_webflux_reactive;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;

@Service
public class NewsService {
    public Flux<News> getItems() {
        Faker faker = new Faker();
        return Flux.generate((SynchronousSink<News> sink) -> sink.next(new News(faker.food().ingredient(), faker.food().ingredient())))
                .delayElements(Duration.ofSeconds(1L));
    }
}
