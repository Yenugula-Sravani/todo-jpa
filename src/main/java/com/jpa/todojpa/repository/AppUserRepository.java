package com.jpa.todojpa.repository;

import com.jpa.todojpa.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Integer> {


    @Query("from AppUser u  WHERE  u.username=:username and u.password=:password ")
    AppUser findByUsernameAndPassword(@Param("password") String password, @Param("username") String username);
}
