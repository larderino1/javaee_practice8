package com.example.demo.Controllers;

import com.example.demo.Entity.AddBookDto;
import com.example.demo.Entity.Book;
import com.example.demo.Entity.BookEntity;
import com.example.demo.Services.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCreationController {
    @Autowired
    private BookService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<AddBookDto> create(@RequestBody final Book book){
        BookEntity entity = new BookEntity();
        BeanUtils.copyProperties(book, entity);
        service.save(entity);
        System.out.print("request accepted");
        System.out.print(book);

        return ResponseEntity.ok(AddBookDto.get(book.getTitle(), book.getAuthor(), book.getIsbn()));
    }
}
