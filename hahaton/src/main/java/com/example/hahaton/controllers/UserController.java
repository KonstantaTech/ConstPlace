package com.example.hahaton.controllers;

import com.example.hahaton.DTO.UserPersonalPageDTO;
import com.example.hahaton.services.userServices.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/cabinet")
    private @ResponseBody UserPersonalPageDTO getPersonalPageData(Principal principal){
        System.out.println(principal);
        return userService.getUserData(principal.getName());
    }
}
