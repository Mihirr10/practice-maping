package com.example.interview.service;

import com.example.interview.dto.BookDto;
import com.example.interview.dto.MapStructMapper;
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
import java.util.stream.Collectors;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;

  @Autowired
  MapStructMapper mapStructMapper;

  public List<BookDto> getAllBooks(){
    return bookRepository.findAll().stream().map(book -> mapStructMapper.toDto(book)).collect(Collectors.toList());
  }

  public Book addBook(Book book){
    return bookRepository.save(book);
  }

  public List<Book> getBookByAuthors(String authorName){
    return bookRepository.findByAuthorsAuthorName(authorName);
  }

  public List<Book> getBookByLibrary(String libraryName){
    return bookRepository.findByLibraryLibraryName(libraryName);
  }

  public List<Book> getBookByPublishedYearAndAge(int age,int publishedYear){
    return bookRepository.findByAuthorsAgeLessThanAndPublishYear(age,publishedYear);
  }

  public List<Book> getBookByPublishedYear(int publishYear,int endYear){
    return bookRepository.findByPublishYearBetween(publishYear,endYear);
  }

}
