package com.elProfeLugel.graphQL.models;

public class Book {
    private Integer id;
    private  String title;
    private Integer pages;
    private Integer rating;
    private Author author;

    public Book(Integer id, String title, Integer pages, Integer rating, Author author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.rating = rating;
        this.author = author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getRating() {
        return rating;
    }

    public Author getAuthor() {
        return author;
    }
}
