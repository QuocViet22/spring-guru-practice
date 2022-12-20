package com.spring.demo.services;

import com.spring.demo.dto.UserCreationDTO;
import com.spring.demo.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO create(UserCreationDTO dto);

    List<UserDTO> findAll();
}
