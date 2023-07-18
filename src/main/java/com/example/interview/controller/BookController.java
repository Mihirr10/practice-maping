package com.example.interview.controller;


import com.example.interview.entities.Book;
import com.example.interview.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

  @Autowired
  BookService bookService;


  @GetMapping
  public List<Book> getAllBooks(){
    return bookService.getAllBooks();
  }

  @PostMapping
  public Book addBook(@RequestBody Book book){
    return bookService.addBook(book);
  }
}
