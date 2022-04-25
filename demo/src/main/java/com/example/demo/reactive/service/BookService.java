package com.example.demo.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.reactive.domain.Book;
import com.example.demo.reactive.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    @Cacheable("books")
//    public Book getByIsbn(String isbn) {
//        simulateSlowService();
//        System.out.println("aa");
//        return bookRepository.findAllByIsbn(isbn);
//    }
    
    private void simulateSlowService() {
        try { 
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
