package com.example.bookclg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class Book {

    private @Id @GeneratedValue Long id;
    private String name;
    private String genre;
    private String author;

    public Book () {

    }

}
