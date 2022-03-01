package com.example.bookclg.service;

import com.example.bookclg.model.Book;
import java.util.List;
import java.util.Optional;


public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBooksById(Long id);
}
