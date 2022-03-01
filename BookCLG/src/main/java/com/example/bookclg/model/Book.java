package com.example.bookclg.model;

import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Builder
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
