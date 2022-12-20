package com.spring.demo.services.impl;

import com.spring.demo.dto.UserCreationDTO;
import com.spring.demo.dto.UserDTO;
import com.spring.demo.entity.Role;
import com.spring.demo.entity.User;
import com.spring.demo.exeption.ResourceNotFoundException;
import com.spring.demo.mapper.UserMapper;
import com.spring.demo.repository.RoleRepository;
import com.spring.demo.repository.UserRepository;
import com.spring.demo.services.EncodePasswordService;
import com.spring.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final RoleRepository roleRepository;

    //    @Autowired
    private final EncodePasswordService encodePasswordService;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, @Qualifier("typeA") EncodePasswordService encodePasswordService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.encodePasswordService = encodePasswordService;
    }

    @Override
    public UserDTO create(UserCreationDTO dto) {
//        User user = UserMapper.getInstance().toEntity(dto);
//        Check user name existed or not
//        if (userRepository.existsByName(dto.getName())) {
//            throw new ResourceNotFoundException("User name has already existed!");
//        }
        User user = new User();
        user.setName(dto.getName());
        user.setPassword(encodePasswordService.encodePasword(dto.getPassword()));
        List<Role> roles = roleRepository.findAllById(dto.getRoleIds());
        user.setRoles(roles);
        userRepository.save(user);
        return UserMapper.getInstance().toDTO(user);
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> UserMapper.getInstance().toDTO(user))
                .collect(Collectors.toList());
    }
}
