package com.example.interview.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int authorId;
  private String authorName;
  private int age;

 @ManyToMany(mappedBy = "authors")
 @JsonIgnore
  private List<Book> books;

}
