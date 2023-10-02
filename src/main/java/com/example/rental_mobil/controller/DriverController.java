package com.example.rental_mobil.controller;

import com.example.rental_mobil.entity.Customer;
import com.example.rental_mobil.entity.Driver;
import com.example.rental_mobil.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;


    @GetMapping("/getAllDrv")
    public List<Driver> getAllDriver(){
        List<Driver> list = driverRepository.findAll();
        return list;
    }

    @GetMapping("/getDrvByAddress")
    public List<Driver> findByAddress(@RequestParam String address){
        return driverRepository.findByAddress(new String(address));
    }

    @GetMapping("/getDrvByAddress2")
    public List<Driver> findByAddress2(@RequestParam String address) {
        return driverRepository.findByAddress2(new String(address));
    }

    @GetMapping("/getDrvByUsername")
    public List<Driver> findByUsername(@RequestParam String username){
        return driverRepository.findByUsername(new String(username));
    }

    @PostMapping("/saveDrv")
    public String saveDrv(@RequestBody Driver driver){
        driverRepository.save(driver);
        return "DRIVER SAVED";
    }

    @DeleteMapping("/deleteDrv")
    public String deleteDrv(@RequestParam String id){
        driverRepository.deleteById(String.valueOf(id));
        return "DRIVER DELETE SUCCESS";
    }
}
