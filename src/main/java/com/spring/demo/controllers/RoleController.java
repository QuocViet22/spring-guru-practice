package com.spring.demo.controllers;

import com.spring.demo.dto.RoleDTO;
import com.spring.demo.entity.User;
import com.spring.demo.services.RoleService;
import com.spring.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoleController {

//    @Autowired
//    private UserService userService;

    private final RoleService roleService;

    private final UserService userService;

    public RoleController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostMapping("/role")
    public RoleDTO create(@RequestBody RoleDTO dto) {
        return roleService.create(dto);
    }

    public String display() {
        return roleService.display();
    }
}
