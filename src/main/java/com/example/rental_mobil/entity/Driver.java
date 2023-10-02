package com.example.rental_mobil.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "table_driver")
public class Driver{

    @Id
    @Column(name="id_driver")
    private String id;
    @Column(name="nama_driver")
    private String username;
    @Column(name="alamat")
    private String address;
    @Column(name="tgl_lahir")
    private Date tgl_lahir;
    @Column(name="no_telp")
    private String noTelp;

    @OneToMany(mappedBy = "driver")
    private List<Penyewaan> penyewaanList;

}
