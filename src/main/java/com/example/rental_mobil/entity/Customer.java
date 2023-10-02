package com.example.rental_mobil.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "table_customer")
public class Customer{

    @Id
    @Column(name="id_customer")
    private String id;
    @Column(name="nama_customer")
    private String username;
    @Column(name="no_ktp")
    private String noKTP;
    @Column(name="alamat")
    private String address;
    @Column(name="tgl_lahir")
    private Date tgl_lahir;
    @Column(name="no_telp")
    private String noTelp;

    @OneToMany(mappedBy = "customer")
    private List<Penyewaan> penyewaanList;
}
