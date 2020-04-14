package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "books")
@NoArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
        @NamedQuery(query = "SELECT book FROM BookEntity book WHERE book.author = :author", name = BookEntity.FIND_BY_AUTHOR),
        @NamedQuery(query = "SELECT book FROM BookEntity book WHERE book.isbn = :isbn", name = BookEntity.FIND_BY_ISBN),
        @NamedQuery(query = "SELECT book FROM BookEntity book WHERE book.title = :title", name = BookEntity.FIND_BY_TITLE)
})
public class BookEntity {

    public static final String FIND_BY_AUTHOR = "BookEntity.FIND_BY_AUTHOR";
    public static final String FIND_BY_ISBN = "BookEntity.FIND_BY_ISBN";
    public static final String FIND_BY_TITLE = "BookEntity.FIND_BY_TITLE";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;
    @Column(name = "isbn")
    private String isbn;



}
