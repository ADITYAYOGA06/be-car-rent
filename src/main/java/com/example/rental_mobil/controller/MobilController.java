package com.example.rental_mobil.controller;

import com.example.rental_mobil.entity.Driver;
import com.example.rental_mobil.entity.Mobil;
import com.example.rental_mobil.repository.MobilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobilController {

    @Autowired
    private MobilRepository mobilRepository;

    @GetMapping("/getAllMobil")
    public List<Mobil> getAllMobil(){
        List<Mobil> list = mobilRepository.findAll();
        return list;
    }

    @GetMapping("/getCarByMerk")
    public List<Mobil> getAllByMerk(@RequestParam String merk){
        List<Mobil> list = mobilRepository.findByMerk(merk);
        return list;
    }

    @PostMapping("/saveMobil")
    public String saveMobil(@RequestBody Mobil mobil){
        mobilRepository.save(mobil);
        return "MOBIL SAVED";
    }

    @DeleteMapping("/deleteMobilById")
    public String deleteMobil(@RequestParam String idMobil){
        mobilRepository.deleteById(String.valueOf(idMobil));
        return "MOBIL DELETE SUCCESS";
    }

    @DeleteMapping("/deleteMobilByPlat")
    public String deleteMobilByPlat(@RequestParam String noPlat){
        mobilRepository.deleteByPlat(String.valueOf(noPlat));
        return "MOBIL DELETE SUCCESS";
    }

    @PatchMapping("/updateTarifByPlat")
    public int updateTarifByPlat(@RequestParam String noPlat, @RequestParam int tarifPerHari){
        return mobilRepository.updateHargaMobil(noPlat, tarifPerHari);
    }

}
