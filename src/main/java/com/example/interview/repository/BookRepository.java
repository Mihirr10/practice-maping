package com.example.interview.repository;

import com.example.interview.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
  List<Book> findByAuthorsAuthorName(String authorName);
  List<Book> findByLibraryLibraryName(String libraryName);
  List<Book> findByAuthorsAgeLessThanAndPublishYear(int age,int year);
  List<Book> findByPublishYearBetween(int year,int endYear);
}
