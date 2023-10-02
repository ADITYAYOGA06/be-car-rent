package com.example.rental_mobil.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "table_transaksi")
public class Transaksi {

    @Id
    @Column(name = "id_transaksi")
    private String idTransaksi;
//    @Column(name =  "id_penyewaan")
//    private String idPenyewaan;
//    @Column(name = "id_mobil")
//    private String idMobil;
    @Column(name = "harga")
    private int harga;
    @Column(name = "tgl_bayar")
    private Date tglBayar;

    @OneToOne
    @JoinColumn(name = "id_penyewaan")
    @JsonIgnore
    private Penyewaan idPenyewaan;

    @ManyToOne
    @JoinColumn(name = "id_mobil")
    @JsonIgnore
    private Mobil idMobil;
}
