package com.example.minor1.repository;

import com.example.minor1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
