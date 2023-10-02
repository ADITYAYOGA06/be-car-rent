package com.example.rental_mobil.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "table_penyewaan")
public class Penyewaan {

    @Id
    @Column(name = "id_penyewaan")
    private String idPenyewaan;
//    @Column(name = "id_driver")
//    private String idDriver;
//    @Column(name = "id_customer")
//    private String idCustomer;
    @Column(name = "tgl_pinjam")
    private Date tglPinjam;
    @Column(name = "tgl_kembali")
    private Date tglKembali;

    @OneToOne(mappedBy = "idPenyewaan")
    private Transaksi transaksi;

    @ManyToOne
    @JoinColumn(name = "id_driver")
    @JsonIgnore
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    @JsonIgnore
    private Customer customer;
}
