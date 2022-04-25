package com.example.demo.reactive.controller;

import com.example.demo.reactive.domain.User;
import com.example.demo.reactive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFiles(@RequestParam("files") MultipartFile[] files) {
      String message = "";
      try {
        
        return ResponseEntity.status(HttpStatus.OK).body("done");
      } catch (Exception e) {
        message = "Fail to upload files!";
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("err");
      }
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    private Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findUserById(id);
        }


    @GetMapping("/")
    private Flux<User> getAllUserById() {
        return userRepository.findAllUser();
    }

    @PostMapping("/update")
    private Mono<User> updateEmployee(@RequestBody User user) {
        return userRepository.updateUser(user);
    }
}
