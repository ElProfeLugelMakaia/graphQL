package com.elProfeLugel.graphQL.controllers;

import com.elProfeLugel.graphQL.models.Book;
import com.elProfeLugel.graphQL.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    BookRepository repository;

    public BookController() {
        this.repository = new BookRepository();
    }

    @QueryMapping
    public List<Book> findAll(){
        return this.repository.findAll();
    }

    @QueryMapping
    public Book findbyId(Integer id){
        return  this.repository.findById(id);
    }
}
