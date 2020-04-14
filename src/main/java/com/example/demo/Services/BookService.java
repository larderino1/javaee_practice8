package com.example.demo.Services;

import com.example.demo.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookService extends JpaRepository<BookEntity, Integer> {
    BookEntity save(BookEntity book);

    List<BookEntity> findAllByTitle(String title);

    List<BookEntity> findAllByIsbn(String isbn);

    List<BookEntity> findAllByAuthor(String author);

    List<BookEntity> findAllByIsbnOrTitle(String isbn, String title);
}
