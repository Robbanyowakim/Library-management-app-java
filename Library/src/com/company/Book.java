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

    public ArrayList getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(ArrayList authors) {
        this.authors = authors;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
