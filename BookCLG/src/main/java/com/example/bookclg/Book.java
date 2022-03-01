package com.example.bookclg;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
public class Book {

    private @Id @GeneratedValue Long id;
    private String name;
    private String genre;
    private String author;

    public Book(Long id,String name, String genre, String author) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
