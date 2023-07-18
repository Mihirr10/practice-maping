package com.example.interview.service;

import com.example.interview.entities.Author;
import com.example.interview.entities.Book;
import com.example.interview.entities.Library;
import com.example.interview.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;

  public List<Book> getAllBooks(){
    return bookRepository.findAll();
  }

  public Book addBook(Book book){
    return bookRepository.save(book);
  }

}
