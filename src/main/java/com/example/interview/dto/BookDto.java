package com.example.interview.dto;


import lombok.Data;
import org.mapstruct.Mapper;

@Data
public class BookDto {

  private String language;
  private int publishYear;
}
