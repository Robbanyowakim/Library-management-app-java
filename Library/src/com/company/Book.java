package com.company;

import java.util.ArrayList;

public class Book  {
    private String ISBN;
    private String name;
    private ArrayList authors;
    private int numberOfPages;
    private String language;
    private String publisher;

    public Book(String ISBN, String name, int numberOfPages, String language, String publisher, ArrayList authors) {
        this.ISBN = ISBN;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.publisher = publisher;
        this.authors = authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }
}