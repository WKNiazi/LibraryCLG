package com.example.bookclg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class BookClgApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookClgApplication.class, args);
    }

}
