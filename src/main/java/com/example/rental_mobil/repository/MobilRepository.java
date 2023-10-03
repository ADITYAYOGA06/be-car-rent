package com.example.rental_mobil.repository;
import com.example.rental_mobil.entity.Mobil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MobilRepository extends JpaRepository<Mobil, String> {
    @Query("select x from Mobil x where x.merk = :merk")
    List<Mobil> findByMerk(String merk);
}
