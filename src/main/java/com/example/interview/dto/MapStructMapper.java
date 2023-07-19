package com.example.interview.dto;


import com.example.interview.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

  public BookDto toDto(Book book);
}
