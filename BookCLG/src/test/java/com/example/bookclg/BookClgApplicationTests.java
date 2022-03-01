package com.example.bookclg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.persistence.PersistenceException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

@SpringBootTest
class BookClgApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    BookRepo brepo;

    @Test
    public void dbEntryCheck() {
        Book book = new Book ("Yuri Kites Adventure","Sci-Fi","Nick Federer");

        assertThatExceptionOfType(PersistenceException.class).isThrownBy( () -> {
            brepo.insertWithConstruct(book);
        }
        );
    }

}
