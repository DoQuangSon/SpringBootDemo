package com.example.demo.reactive.config;

import com.example.demo.reactive.domain.User;
import com.example.demo.reactive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyExtractors.toMono;

@Configuration
public class UserFunctionalConfig {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Bean
//    RouterFunction<ServerResponse> getAllEmployeesRoute() {
//        return route(GET("/users"),
//                req -> ok().body(
//                        userRepository.findAllUser(), User.class));
//    }
//
//    @Bean
//    RouterFunction<ServerResponse> getEmployeeByIdRoute() {
//        return route(GET("/users/{id}"),
//                req -> ok().body(
//                        userRepository.findUserById(req.pathVariable("id")), User.class));
//    }
//
//    @Bean
//    RouterFunction<ServerResponse> updateEmployeeRoute() {
//        return route(POST("/users/update"),
//                req -> req.body(toMono(User.class))
//                        .doOnNext(userRepository::updateUser)
//                        .then(ok().build()));
//    }
//
//    @Bean
//    RouterFunction<ServerResponse> composedRoutes() {
//        return
//                route(GET("/users"),
//                        req -> ok().body(
//                                userRepository.findAllUser(), User.class))
//
//                        .and(route(GET("/users/{id}"),
//                                req -> ok().body(
//                                        userRepository.findUserById(req.pathVariable("id")), User.class)))
//
//                        .and(route(POST("/users/update"),
//                                req -> req.body(toMono(User.class))
//                                        .doOnNext(userRepository::updateUser)
//                                        .then(ok().build())));
//    }


}
