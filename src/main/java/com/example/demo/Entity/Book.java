package com.example.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String isbn;
    private String title;
    private String author;
}
