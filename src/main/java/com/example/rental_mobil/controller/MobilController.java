package com.example.rental_mobil.controller;

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

    @PostMapping("/saveMobil")
    public String saveMobil(@RequestBody Mobil mobil){
        mobilRepository.save(mobil);
        return "MOBIL SAVED";
    }

    @DeleteMapping("/deleteMobil")
    public String deleteMobil(@RequestParam String idMobil){
        mobilRepository.deleteById((idMobil));
        return "MOBIL DELETE SUCCESS";
    }

}
