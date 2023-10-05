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

    @GetMapping("/getCustByAddress")
    public List<Customer> findByAddress(@RequestParam String address){
        return customerRepository.findByAddress(new String(address));
    }

    @GetMapping("/getCustByAddress2")
    public List<Customer> findByAddress2(@RequestParam String address) {
        return customerRepository.findByAddress2(new String(address));
    }

    @GetMapping("/getCustByUsername")
    public List<Customer> findByUsername(@RequestParam String username){
        return customerRepository.findByUsername(new String(username));
    }

    @PostMapping("/saveCust")
    public String saveCust(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "CUSTOMER DATA SAVED";
    }

    @DeleteMapping("/deleteCust")
    public String deleteCust(@RequestParam String id){
        customerRepository.deleteById(String.valueOf(id));
        return "CUSTOMER DELETE SUCCESS";
    }

    @DeleteMapping("/deleteCustByUsername")
    public String deleteCustByUsername(@RequestParam String username){
        customerRepository.deleteByName(String.valueOf(username));
        return "CUSTOMER DELETE SUCCESS";
    }

    @PatchMapping("/updateCustByUsername")
    public int updateCustAddress(@RequestParam String username,@RequestParam String address){
        return customerRepository.updateCustAddress(username, address);
    }


}
