package com.company;

import java.util.ArrayList;

public class Book  {
    private String ISBN;
    private String name;
    private ArrayList list;
    private int numberOfPages;
    private String language;
    private String publisher;

    public Book(String ISBN, String name, ArrayList list, int numberOfPages, String language, String publisher) {
        this.ISBN = ISBN;
        this.name = name;
        this.list = list;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.publisher = publisher;
    }
}