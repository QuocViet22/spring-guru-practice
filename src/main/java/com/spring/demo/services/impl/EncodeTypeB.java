package com.spring.demo.services.impl;

import com.spring.demo.services.EncodePasswordService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("typeB")
public class EncodeTypeB implements EncodePasswordService {
    @Value("${encode.typeB}")
    String type;

    @Override
    public String encodePasword(String password) {
        return password + type;
    }
}
