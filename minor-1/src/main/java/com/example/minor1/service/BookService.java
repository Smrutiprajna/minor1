package com.example.minor1.service;

import com.example.minor1.model.Author;
import com.example.minor1.model.Book;
import com.example.minor1.repository.AuthorRepository;
import com.example.minor1.repository.BookRepository;
import com.example.minor1.request.BookCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;
    public void create(BookCreateRequest bookCreateRequest) {
        Book book=bookCreateRequest.to();
        Author author=book.getAuthor();
        Author authorFromDB=authorRepository.save(author);
        book.setAuthor(authorFromDB);
        authorRepository.save(author);

       // Author author=book.getAuthor();
        //author.setId(1);
        bookRepository.save(book);
    }
}
