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
    private final String title;
    private final String author;
    private final String isbn;
}
