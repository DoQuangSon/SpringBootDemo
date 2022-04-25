package com.example.demo.reactive;

import com.example.demo.reactive.domain.Book;
import com.example.demo.reactive.repository.BookRepository;
import com.example.demo.reactive.webclient.UserWebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        UserWebClient userWebClient = new UserWebClient();
//
//        userWebClient.consume();
    }

    @PostConstruct
    public void saveBook() {
//        List<Book> books = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            Book book = new Book();
//            book.setIsbn(UUID.randomUUID().toString());
//            book.setName("book" + UUID.randomUUID().toString());
//            books.add(book);
//        }
//
//        bookRepository.saveAll(books);
    }

}
