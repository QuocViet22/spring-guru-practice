package com.spring.demo.mapper;

import com.spring.demo.dto.UserCreationDTO;
import com.spring.demo.dto.UserDTO;
import com.spring.demo.entity.User;

import java.util.stream.Collectors;

public class UserMapper {

    private static UserMapper INSTANCE;
    public static UserMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserMapper();
        }
        return INSTANCE;
    }

    public User toEntity(UserCreationDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setPassword(dto.getPassword());
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setRoles(user.getRoles().stream()
                .map(role -> RoleMapper.getInstance().toDTO(role))
                .collect(Collectors.toList()));
        return dto;
    }
}
