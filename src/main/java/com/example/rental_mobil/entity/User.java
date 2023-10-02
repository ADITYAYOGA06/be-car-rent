package com.example.rental_mobil.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_user")
@Data
public class User {

    @Id
    @Column(name = "id_user")
    private String id;
    @Column(name = "nama_user")
    private String username;
    @Column(name = "email")
    private String email;
//    @Column(name = "id_role")
//    private String roleId;

    @OneToOne
    @JoinColumn(name = "id_role")
    private Role role;
}
