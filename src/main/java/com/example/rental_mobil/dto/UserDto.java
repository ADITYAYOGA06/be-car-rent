package com.example.rental_mobil.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private String email;
    private List<PermissionDto> permissionDtoList;
}
