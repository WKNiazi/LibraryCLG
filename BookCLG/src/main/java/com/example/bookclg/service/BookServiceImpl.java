package com.example.bookclg.service;

import com.example.bookclg.repository.BookRepository;
import com.example.bookclg.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBooksById(Long id) {
        return Optional.of(bookRepository.findById(id).get());
    }

}
