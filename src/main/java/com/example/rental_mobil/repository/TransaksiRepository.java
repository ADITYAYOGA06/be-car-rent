package com.example.rental_mobil.repository;

import com.example.rental_mobil.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

public interface TransaksiRepository extends JpaRepository<Transaksi, String> {

}
