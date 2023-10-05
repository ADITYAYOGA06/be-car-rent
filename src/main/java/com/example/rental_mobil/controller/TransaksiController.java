package com.example.rental_mobil.controller;

import com.example.rental_mobil.entity.Driver;
import com.example.rental_mobil.entity.Transaksi;
import com.example.rental_mobil.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransaksiController {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @GetMapping("/getAllTxn")
    public List<Transaksi> getAllTxn(){
        List<Transaksi> list = transaksiRepository.findAll();
        return list;
    }

    @PostMapping("/saveTxn")
    public String saveTxn(@RequestBody Transaksi transaksi){
        transaksiRepository.save(transaksi);
        return "TRANSAKSI SAVED";
    }

    @DeleteMapping("/deleteTxn")
    public String deleteTxn(@RequestParam String idTransaksi){
        transaksiRepository.deleteById(String.valueOf(idTransaksi));
        return "TRANSAKSI DELETE SUCCESS";
    }

    @GetMapping("/GetTxnById")
    public Optional<Transaksi> findTxnByCarId(@RequestParam String idTransaksi){
         return transaksiRepository.findById(idTransaksi);
    }

//    @GetMapping("/GetTxnByIdTxn2")
//    public List<Transaksi> findTxnById(String idTransaksi){
//        return transaksiRepository.getById(idTransaksi);
//    }

}
