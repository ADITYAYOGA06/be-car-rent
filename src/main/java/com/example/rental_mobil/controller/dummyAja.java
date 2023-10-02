package com.example.rental_mobil.controller;

import org.springframework.web.bind.annotation.RestController;

import java.security.Permission;

@RestController
public class dummyAja {

//    public List<UserDto> getAllUser(){
//        List<User> list = userRepository.findAll();
//        List<UserDto> result = new ArrayList<>();
//        for(User u: list){
//            UserDto userDto = new UserDto();
//            userDto.setEmail(u.getEmail());
//            List<PermissionDto> permissionDtoList = new ArrayList<>();
//            for(Permission p:u.getRole().getPermissionList()){
//                PermissionDto pdto = new PermissionDto();
//                pdto.setUrl(p.getUrl());
//                permissionDtoList.add(pdto);
//            }
//            userDto.setPermissionDtoList(permissionDtoList);
//            result.add(userDto);
//        }
//        return list;
//    }

}
