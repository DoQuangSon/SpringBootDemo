package com.example.demo.reactive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.reactive.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findAllByIsbn(String isbn);
}
