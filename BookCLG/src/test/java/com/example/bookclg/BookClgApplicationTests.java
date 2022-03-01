package com.example.bookclg;

import com.example.bookclg.model.Book;
import com.example.bookclg.repository.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookClgApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    BookRepo brepo;

    @Test
    public void dbEntryCheck() {
        Book book = new Book (2L,"The Kite Runner","Fictional Story","Khaled Housseini");
        brepo.insertWithConstruct(book);
    }

}
