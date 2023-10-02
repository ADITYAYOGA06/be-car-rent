package com.example.rental_mobil.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "table_mobil")
public class Mobil {

    @Id
    @Column(name = "id_mobil")
    private String idMobil;
    @Column(name = "nama_mobil")
    private String namaMobil;
    @Column(name = "merk")
    private String merk;
    @Column(name = "no_plat")
    private String noPlat;
    @Column(name = "transmisi")
    private String transmisi;
    @Column(name = "tarif_perhari")
    private int tarifPerHari;

    @OneToMany(mappedBy = "idMobil")
    private List<Transaksi> transaksiList;
}
