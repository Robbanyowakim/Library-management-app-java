package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main myApp = new Main();
        LibraryLogic libraryLogic = new LibraryLogic();
        myApp.menu();
        int a = input.nextInt();
        input.nextLine();
        switch (a){
            case 1:
                System.out.print("Enter books ISBN number: ");
                String ISBN = input.nextLine();
                System.out.print("Enter the books name: ");
                String name = input.nextLine();
                System.out.print("Enter the number of pages: ");
                int numberOfPages = input.nextInt();
                input.nextLine();
                System.out.print("Enter tha language of the book: ");
                String language = input.nextLine();
                System.out.print("Enter the publishers name: ");
                String publisher = input.nextLine();
                System.out.print("How many authors does the book have?");
                int authors = input.nextInt();
                input.nextLine();
                ArrayList <String> authorsList = new ArrayList<>();
                for (int i = 1; i <= authors; i++){
                    System.out.printf("[%d] authors name: \n",i);
                    String authorsName = input.nextLine();
                    authorsList.add(authorsName);
                }
                libraryLogic.addBooks(ISBN,name,numberOfPages,language,publisher,authorsList);


        }


    }
    private void menu (){
        System.out.println(" --- --- --- --- ---");
        System.out.println("| 1. Add Books      |");
    }
}
