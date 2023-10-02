package com.example.rental_mobil.controller;

import com.example.rental_mobil.entity.Customer;
import com.example.rental_mobil.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/hello")
    public String helloWorld(){
        return "<h1>HALO</h1>";
    }

    @GetMapping("/getAllCust")
    public List<Customer> getAllCustomer(){
        List<Customer> list = customerRepository.findAll();
        return list;
    }

    @GetMapping("/getByAddress")
    public List<Customer> findByAddress(@RequestParam String address){
        return customerRepository.findByAddress(new String(address));
    }

    @GetMapping("/getByAddress2")
    public List<Customer> findByAddress2(@RequestParam String address) {
        return customerRepository.findByAddress2(new String(address));
    }

    @GetMapping("/getByUsername")
    public List<Customer> findByUsername(@RequestParam String username){
        return customerRepository.findByUsername(new String(username));
    }

    @PostMapping("/saveCust")
    public String saveCust(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "SAVED";
    }

    @DeleteMapping("/deleteCust")
    public String deleteCust(@RequestParam String id){
        customerRepository.deleteById(String.valueOf(id));
        return "DELETE SUCCESS";
    }


}
