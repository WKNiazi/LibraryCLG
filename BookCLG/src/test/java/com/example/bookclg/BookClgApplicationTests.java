package com.example.bookclg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

@SpringBootTest
class BookClgApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void dbEntryCheck() {
        Book book = new Book (1,"Yuri Kites Adventure","Sci-Fi","Nick Federer");
        assertThatExceptionOfType(PersistenceException.class).isThrownBy(() -> {
            
        });
    }

}
