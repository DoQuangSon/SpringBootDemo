//package com.example.demo.reactive.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.demo.reactive.domain.Customer;
//
//public interface CustomerRepository<T> extends JpaRepository<Customer, Integer> {
//    <S extends T> S save(Customer customer);
//    Customer find(Long id);
//    List<Customer> findAll();
//    void update(Customer customer);
//    void delete(Long id);
//}
