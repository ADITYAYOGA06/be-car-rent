package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, String> {
    List<Driver> findByAddress(String address);

    List<Driver> findByUsername(String username);

    @Query("select x from Driver x where x.address = :address")
    List<Driver> findByAddress2(String address);

}
