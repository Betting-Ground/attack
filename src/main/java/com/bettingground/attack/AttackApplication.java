package com.bettingground.attack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@EnableJpaAuditing
@SpringBootApplication
public class AttackApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttackApplication.class, args);
    }

}
