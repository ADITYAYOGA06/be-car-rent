//package com.example.rental_mobil.testing;
//
//import com.example.rental_mobil.entity.User;
//import com.example.rental_mobil.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class UserRepositoryTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public void whenFindByUsername_thenReturnUser(){
//        User user = new User();
//        user.setId("USR008");
//        user.setUsername("Adittama Yoga Praditya");
//        user.setEmail("tama@ymail.com");
//        entityManager.persist(user);
//
//        User foundUser = (User) userRepository.findByUsername("Adittama Yoga Praditya");
//
//        assertThat(foundUser.getUsername()).isEqualTo(user.getUsername());
//        assertThat(foundUser.getEmail()).isEqualTo(user.getEmail());
//    }
//}
