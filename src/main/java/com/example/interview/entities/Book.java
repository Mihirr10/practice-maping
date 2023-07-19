package com.example.interview.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int bookId;
  private String language;
  private Integer publishYear;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "Author_id"))
  private List<Author> authors;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn
  @JsonIgnore
  private Library library;

}
