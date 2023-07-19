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
public class Library {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int libraryId;
  private String libraryName;
  private String city;

  @OneToMany(mappedBy = "library")

  private List<Book> books;
}
