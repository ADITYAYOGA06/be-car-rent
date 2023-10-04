package com.example.rental_mobil.controller;

import com.example.rental_mobil.dto.PermissionDto;
import com.example.rental_mobil.dto.UserDto;
import com.example.rental_mobil.entity.Customer;
import com.example.rental_mobil.entity.Permission;
import com.example.rental_mobil.entity.User;
import com.example.rental_mobil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getEntityUser")
    public List<User> getEntityUser(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @GetMapping("/getUserByUsername")
    public List<User> getUserByName(@RequestParam String username){
        return userRepository.findByUsername(new String(username));
    }


    @GetMapping("/getAllUser")
    public List<UserDto> getAllUser(){
        List<User> list = userRepository.findAll();
        List<UserDto> result = new ArrayList<>();
        for(User u: list){
            UserDto userDto = new UserDto();
            userDto.setEmail(u.getEmail());
            List<PermissionDto> permissionDtoList = new ArrayList<>();
            for (Permission p:u.getRole().getPermissionList()){
                PermissionDto pdto = new PermissionDto();
                pdto.setUrl(p.getUrl());
                permissionDtoList.add(pdto);
            }
            userDto.setPermissionDtoList(permissionDtoList);
            result.add(userDto);
        }
        return result;
    }

}
