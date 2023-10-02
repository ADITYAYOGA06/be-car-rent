package com.example.rental_mobil.controller;

import com.example.rental_mobil.entity.Penyewaan;
import com.example.rental_mobil.repository.PenyewaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class PenyewaanController {

    @Autowired
    private PenyewaanRepository penyewaanRepository;

    @GetMapping("/getAllPenyewaan")
    public List<Penyewaan> getAllPenyewaan(){
        List<Penyewaan> list = penyewaanRepository.findAll();
        return list;
    }

    @GetMapping("/getPnyByTglPjm")
    public List<Penyewaan> getPnyByTglPinjam(@RequestParam Date tglPinjam){
        return penyewaanRepository.findByTglPinjam(tglPinjam);
    }

    @GetMapping("/getPnyByTglKbl")
    public List<Penyewaan> getPnyByTglKembali(@RequestParam Date tglKembali){
        return penyewaanRepository.findByTglKembali(tglKembali);
    }

    @GetMapping("/getPnyById")
    public Optional<Penyewaan> getPnyById(@RequestParam String idPenyewaan){
        return penyewaanRepository.findById(idPenyewaan);
    }

    @PostMapping("/savePny")
    public String savePny(@RequestBody Penyewaan penyewaan){
        penyewaanRepository.save(penyewaan);
        return "PENYEWAAN SAVED";
    }

    @DeleteMapping("/deletePny")
    public String deletePny(@RequestParam String idPenyewaan){
        penyewaanRepository.deleteById(String.valueOf(idPenyewaan));
        return "PENYEWAAN DELETE SUCCESS";
    }
}
