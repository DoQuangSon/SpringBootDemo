package com.example.demo.reactive.repository;

import com.example.demo.reactive.domain.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    static Map<Integer, User> userData;

    static Map<Integer, String> userAccessData;

    static {
        userData = new HashMap<>();
        userData.put(1, new User(1, "Employee 1"));
        userData.put(2, new User(2, "Employee 2"));
        userData.put(3, new User(3, "Employee 3"));
        userData.put(4, new User(4, "Employee 4"));
        userData.put(5, new User(5, "Employee 5"));
        userData.put(6, new User(6, "Employee 6"));
        userData.put(7, new User(7, "Employee 7"));
        userData.put(8, new User(8, "Employee 8"));
        userData.put(9, new User(9, "Employee 9"));
        userData.put(10, new User(10, "Employee 10"));

        userAccessData = new HashMap<>();
        userAccessData.put(1, "Employee 1 Access Key");
        userAccessData.put(2, "Employee 2 Access Key");
        userAccessData.put(3, "Employee 3 Access Key");
        userAccessData.put(4, "Employee 4 Access Key");
        userAccessData.put(5, "Employee 5 Access Key");
        userAccessData.put(6, "Employee 6 Access Key");
        userAccessData.put(7, "Employee 7 Access Key");
        userAccessData.put(8, "Employee 8 Access Key");
        userAccessData.put(9, "Employee 9 Access Key");
        userAccessData.put(10, "Employee 10 Access Key");
    }

    public Mono<User> findUserById(String id) {
        return Mono.just(userData.get(Integer.parseInt(id)));
    }

    public Flux<User> findAllUser() {
        return Flux.fromIterable(userData.values());

    }

    public Mono<User> updateUser(User user) {
        User existingUser = userData.get(user.getId());
        if (existingUser != null) {
            existingUser.setName(user.getName());
        }

        return Mono.just(existingUser);
    }
}
