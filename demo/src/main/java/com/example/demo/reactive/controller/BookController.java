package com.example.demo.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reactive.domain.Book;
import com.example.demo.reactive.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {


    
    @Autowired
    private BookService bookService;
    

//    @GetMapping("/{isbn}")
//    public Book getBookByIsbn(@PathVariable String isbn) {
//        return bookService.getByIsbn(isbn);
//    }
}
