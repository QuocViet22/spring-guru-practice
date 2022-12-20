package com.spring.demo.controllers;

import com.spring.demo.dto.UserCreationDTO;
import com.spring.demo.dto.UserDTO;
import com.spring.demo.exeption.ResourceNotFoundException;
import com.spring.demo.repository.UserRepository;
import com.spring.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    //    @PostMapping("/user")
//    public UserDTO create(@RequestBody UserCreationDTO dto) {
//        return userService.create(dto);
//    }
    @PostMapping("/user")
    public UserDTO create(@RequestBody UserCreationDTO dto) {
        if (userRepository.existsByName(dto.getName())) {
            throw new ResourceNotFoundException("User name has already existed!");
        }
        return userService.create(dto);
    }

    @GetMapping("/user")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
