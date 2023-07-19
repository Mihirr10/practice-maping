package com.example.interview.service;

import com.example.interview.entities.Library;
import com.example.interview.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

  @Autowired
  LibraryRepository libraryRepository;

  public List<Library> getAllLibrary(){
    return libraryRepository.findAll();
  }

  public List<Library> getAllLibraryByBook(int id){
    return libraryRepository.findByBooksBookId(id);
  }

  public Library addLibrary(Library library){
    return libraryRepository.save(library);
  }
}
