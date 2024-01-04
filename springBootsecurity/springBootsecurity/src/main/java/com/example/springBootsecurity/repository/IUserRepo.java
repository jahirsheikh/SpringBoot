package com.example.springBootsecurity.repository;

import com.example.springBootsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

    @Query("select u from User u WHERE u.email=:email")
    Optional<User> findByEmail(@Param("email") String email);
//    public  User getUserByEmil(@Param("email") String email);
}
