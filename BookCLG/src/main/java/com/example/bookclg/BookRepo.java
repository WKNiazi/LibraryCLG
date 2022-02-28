package com.example.bookclg;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class BookRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithConstruct(Book book) {
        entityManager.createNativeQuery("INSERT INTO Book (id, name, genre, author) VALUES (?,?,?,?)")
                .setParameter(1, book.getId())
                .setParameter(2, book.getName())
                .setParameter(3, book.getGenre())
                .setParameter(4, book.getAuthor())
                .executeUpdate();
    }

}
