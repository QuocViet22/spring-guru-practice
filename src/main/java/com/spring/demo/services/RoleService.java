package com.spring.demo.services;

import com.spring.demo.dto.RoleDTO;

public interface RoleService {
    RoleDTO create(RoleDTO dto);

    String display();
}
