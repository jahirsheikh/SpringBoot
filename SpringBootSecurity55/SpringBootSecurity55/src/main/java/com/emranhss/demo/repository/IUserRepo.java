package com.emranhss.demo.repository;

import com.emranhss.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.email=:email")
    public User getUserByEmail(@Param("email") String email);

}
