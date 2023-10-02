package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Penyewaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface PenyewaanRepository extends JpaRepository<Penyewaan, String> {

    List<Penyewaan> findByTglPinjam(Date tglPinjam);

    @Query("select x from Penyewaan x where x.tglKembali = :tglKembali")
    List<Penyewaan> findByTglKembali(Date tglKembali);
}
