package com.example.interview.controller;


import com.example.interview.dto.BookDto;
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
  public List<BookDto> getAllBooks(){
    return bookService.getAllBooks();
  }

  @PostMapping
  public Book addBook(@RequestBody Book book){
    return bookService.addBook(book);
  }

//  @GetMapping("/{authorName}")
//  public List<Book> getBookByAuthors(@PathVariable String authorName){
//    return bookService.getBookByAuthors(authorName);
//  }

//  @GetMapping("/{libraryName}")
//  public List<Book> getBookByLibrary(@PathVariable String libraryName){
//    return bookService.getBookByLibrary(libraryName);
//  }

    @GetMapping("/{publishYear}/year/{endYear}")
  public List<Book> getBookByPublishedYear(@PathVariable int publishYear,@PathVariable int endYear){
    return bookService.getBookByPublishedYear(publishYear,endYear);
  }



//  @GetMapping("/{age}/AgeAndYear/{publishedYear}")
//  public List<Book> getBookByPublishedYearAndAge(@PathVariable int age,@PathVariable int publishedYear){
//    return bookService.getBookByPublishedYearAndAge(age,publishedYear);
//  }
}
