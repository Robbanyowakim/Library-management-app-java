package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {
    private String ISBN;
    private String name;
    private ArrayList authors;
    private int numberOfPages;
    private String language;
    private String publisher;
    private String category;

    public Book(String ISBN, String name, int numberOfPages, String language, String publisher, ArrayList authors, String category) {
        this.ISBN = ISBN;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.publisher = publisher;
        this.authors = authors;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return
                "|| ISBN: " + ISBN +
                " || Name: " + name +
                " || Pages: " + numberOfPages +
                " || Language: " + language +
                " || Publisher: " + publisher +
                        " || Authors: " + authors +
                        " || Category: " + category;
    }
}
