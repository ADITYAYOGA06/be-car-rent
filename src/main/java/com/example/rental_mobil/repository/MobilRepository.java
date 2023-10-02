package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Mobil;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MobilRepository extends JpaRepository<Mobil, String> {

}
