package com.example.bookclg.controller;

import com.example.bookclg.model.Book;
import com.example.bookclg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    private List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private Optional<Book> getBookById(@PathVariable("id") Long id){
        return bookService.getBooksById(id);
    }


}
