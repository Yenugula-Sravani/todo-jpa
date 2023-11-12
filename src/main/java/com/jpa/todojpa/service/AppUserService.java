package com.jpa.todojpa.service;

import com.jpa.todojpa.model.AppUser;
import com.jpa.todojpa.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    @Autowired
   private AppUserRepository appUserRepository;

    public AppUser register(AppUser appUser) {
        return  appUserRepository.save(appUser);

    }

    public AppUser login(AppUser appUser) {
        AppUser LoggedInuser=appUserRepository.findByUsernameAndPassword(appUser.getUsername(), appUser.getPassword());
        return LoggedInuser;
    }
}
