package com.company;

import java.util.ArrayList;

public class LibraryLogic {
    public ArrayList <Book> bookList = new ArrayList<>();


    public Book addBooks (String ISBN,String name,int numberOfPages,String language, String publisher,ArrayList authorsList){
        Book newBook = new Book(ISBN,name,numberOfPages,language,publisher,authorsList);
        return newBook;
    }
}
