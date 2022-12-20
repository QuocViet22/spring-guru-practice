package com.spring.demo.services.impl;

import com.spring.demo.dto.RoleDTO;
import com.spring.demo.entity.Role;
import com.spring.demo.mapper.RoleMapper;
import com.spring.demo.repository.RoleRepository;
import com.spring.demo.services.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Throwable.class)
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleDTO create(RoleDTO dto) {
        Role role = new Role();
        role.setName(dto.getName());
        roleRepository.save(role);
        return RoleMapper.getInstance().toDTO(role);
    }

    @Override
    public String display() {
        return "RoleController";
    }
}
