package com.example.minor1.controller;

import com.example.minor1.model.Book;
import com.example.minor1.request.BookCreateRequest;
import com.example.minor1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void createBook(@RequestBody BookCreateRequest bookCreateRequest)
    {
        bookService.create(bookCreateRequest);
    }
}
