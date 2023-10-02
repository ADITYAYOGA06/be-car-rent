package com.example.rental_mobil.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_role")
@Data
public class Role {

    @Id
    @Column(name = "id_role")
    private String id;
    @Column(name = "nama_role")
    private String roleName;
    @Column(name = "permission_desc")
    private String permissionDesc;

    @OneToMany(mappedBy = "role")
    private List<Permission> permissionList;

}
