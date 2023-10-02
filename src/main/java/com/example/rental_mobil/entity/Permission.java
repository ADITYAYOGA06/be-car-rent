package com.example.rental_mobil.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "table_permission")
@Data
public class Permission {

    @Id
    @Column(name = "id_permission")
    private String id;
    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_role")
    @JsonIgnore
    private Role role;
}
