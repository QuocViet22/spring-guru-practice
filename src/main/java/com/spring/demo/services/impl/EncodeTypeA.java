package com.spring.demo.services.impl;

import com.spring.demo.services.EncodePasswordService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("typeA")
//@Primary
public class EncodeTypeA implements EncodePasswordService {
    @Value("${encode.typeA}")
    String type;

    @Override
    public String encodePasword(String password) {
        return password + type;
    }
}
