package com.spring.demo;

import com.spring.demo.controllers.RoleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.spring")
@SpringBootApplication
public class SpringGuruApplication {
    public static void main(String[] args) {
//        SpringApplication.run(SpringGuruApplication.class, args);

        // Test Role controller DI - IOC
        ApplicationContext ctx = SpringApplication.run(SpringGuruApplication.class, args);
        RoleController roleController = (RoleController) ctx.getBean(RoleController.class);
        System.out.println(roleController.display());
    }
}
