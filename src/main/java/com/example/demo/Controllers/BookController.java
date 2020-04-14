package com.example.demo.Controllers;

import com.example.demo.Entity.BookEntity;
import com.example.demo.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @GetMapping("/books_list")
    public List<BookEntity> getAll(){
        return bookService.findAll();
    }

    @ResponseBody
    @GetMapping("/search") 
    public List<BookEntity> getAllByTitleOrIsbn(@RequestParam("param") String param){
        return bookService.findAllByIsbnOrTitle(param, param);
    }
}
