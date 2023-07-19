package com.example.interview.controller;


import com.example.interview.entities.Library;
import com.example.interview.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/libraries")
public class LibraryController {

  @Autowired
  LibraryService libraryService;

  @GetMapping("/{id}")
  public List<Library> getLibraryByBook(@PathVariable int id){
    return libraryService.getAllLibraryByBook(id);
  }
}
