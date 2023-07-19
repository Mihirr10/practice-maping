package com.example.interview.repository;

import com.example.interview.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer> {

  List<Library> findByBooksBookId(int bookId);
}
