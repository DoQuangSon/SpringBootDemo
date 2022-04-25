package com.example.demo.reactive.webclient;

import com.example.demo.reactive.domain.User;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserWebClient {
//    WebClient webClient = WebClient.create("http://localhost:7070");
//
//    public void consume() {
//
//        Mono<User> employeeMono = webClient.get()
//                .uri("/users/{id}", "1")
//                .retrieve()
//                .bodyToMono(User.class);
//
//        employeeMono.subscribe(System.out::println);
//
//        Flux<User> employeeFlux = webClient.get()
//                .uri("/users/")
//                .retrieve()
//                .bodyToFlux(User.class);
//
//        employeeFlux.subscribe(System.out::println);
//    }
}
