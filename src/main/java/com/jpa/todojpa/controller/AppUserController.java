package com.jpa.todojpa.controller;

import com.jpa.todojpa.model.AppUser;
import com.jpa.todojpa.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AppUserController {
    @Autowired
   private AppUserService userService;

    @RequestMapping("/login")
    public AppUser login(@RequestBody AppUser appUser){
        return userService.login(appUser);
    }

    @RequestMapping("/register")
    public AppUser register(@RequestBody AppUser appUser){
        return userService.register(appUser);
    }


}
