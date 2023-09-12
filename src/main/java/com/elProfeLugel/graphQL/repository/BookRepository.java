package com.elProfeLugel.graphQL.repository;

import com.elProfeLugel.graphQL.models.Author;
import com.elProfeLugel.graphQL.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    List<Book> bd;

    public BookRepository(){
        bd = new ArrayList<>();
        this.bd.add(new Book(1, "El señor de los anillos", 1530, 4, new Author(1, "J. R. R.", "Tolkien")));
        this.bd.add(new Book(2, "El hobbit", 1230, 5, new Author(1, "J. R. R.", "Tolkien")));
        this.bd.add(new Book(3, "Harry Potter", 500, 3, new Author(1, "J. K.", "Rowling")));
    }

    public List<Book> findAll(){
        return this.bd;
    }

    public Book findById(Integer id){
        Optional<Book> res = this.bd.stream().filter(b -> b.getId().equals(id)).findFirst();
        if(res.isEmpty()){
            throw  new RuntimeException("Libro no encontrado");
        }
        return res.get();
    }
}
