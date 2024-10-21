package com.example.SwaggerNew_project.controller;

import com.example.SwaggerNew_project.configuration.Groups;
import com.example.SwaggerNew_project.configuration.Reply;
import com.example.SwaggerNew_project.dtos.UserDTO;
import com.example.SwaggerNew_project.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("addUpdateUser")
    public Reply addUpdateUser(@Validated(Groups.Add.class) @RequestBody UserDTO userDTO){
        System.out.println("Creating new Object : Hello");
        Reply reply=new Reply();
        userService.addUser(reply,userDTO);
        return reply;
    }

    @PostMapping("getUserData")
    public Reply getUserData(@Validated(Groups.Get.class) @RequestBody UserDTO userDTO){
        System.out.println("Fetching the user data");
        Reply reply=new Reply();
        userService.fetchUserData(reply,userDTO);
        return reply;
    }

}
