package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    List<Customer> findByAddress(String address);

    List<Customer> findByUsername(String username);

    @Query("select x from Customer x where x.address = :address")
    List<Customer> findByAddress2(String address);

}
