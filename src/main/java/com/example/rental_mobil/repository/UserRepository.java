package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Customer;
import com.example.rental_mobil.entity.User;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByUsername(String username);

    @Query("select x from User x where x.email = :email")
    List<User> findUserByEmail(String email);

}
