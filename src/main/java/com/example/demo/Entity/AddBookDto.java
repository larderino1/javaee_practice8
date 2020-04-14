package com.example.demo.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor(staticName = "get")
public class AddBookDto {
    private String title;
    private String author;
    private String isbn;
}
