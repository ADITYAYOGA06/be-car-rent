package com.example.rental_mobil.repository;
import com.example.rental_mobil.entity.Mobil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface MobilRepository extends JpaRepository<Mobil, String> {
    @Query("select x from Mobil x where x.merk = :merk")
    List<Mobil> findByMerk(String merk);

    @Transactional
    @Modifying
    @Query("delete from Mobil x where x.noPlat = :noPlat")
    void deleteByPlat(@Param("noPlat") String noPlat);

    @Transactional
    @Modifying
    @Query("update Mobil x set x.tarifPerHari = :tarifPerHari where x.noPlat = :noPlat")
    int updateHargaMobil(@Param("noPlat") String noPlat, @Param("tarifPerHari") int tarifPerHari);
}
