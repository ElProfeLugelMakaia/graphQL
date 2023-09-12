package com.elProfeLugel.graphQL.repository;

import com.elProfeLugel.graphQL.models.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
    List<Author> bd;

    public AuthorRepository(){
        this.bd = new ArrayList<>();
    }

    public List<Author> findAll(){
        return this.bd;
    }

    public Author findById(Integer id){
        Optional<Author> res = this.bd.stream().filter(b -> b.getId().equals(id)).findFirst();
        if(res.isEmpty()){
            throw  new RuntimeException("Autor no encontrado");
        }
        return res.get();
    }
}
