package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main myApp = new Main();
        LibraryLogic libraryLogic = new LibraryLogic();
        int loop = 0;
        do {

            myApp.menu();
            int a = input.nextInt();
            input.nextLine();
            switch (a) {
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
                    ArrayList<String> authorsList = new ArrayList<>();
                    for (int i = 1; i <= authors; i++) {
                        System.out.printf("[%d] authors name: \n", i);
                        String authorsName = input.nextLine();
                        authorsList.add(authorsName);
                    }
                    libraryLogic.bookList.add(libraryLogic.addBooks(ISBN, name, numberOfPages, language, publisher, authorsList));
                    break;
                case 2:
                    for (int i = 0; i < libraryLogic.bookList.size(); i++) {
                        System.out.printf("[%d] %s", i, libraryLogic.bookList.get(i));
                        // Jag är inte klar.
                    }
                    break;
                case 3:
                    break;
                case 4:
                    libraryLogic.addMember();
                    break;
                case 5:
                    libraryLogic.printMembers();
                    libraryLogic.removeMember();
                    break;
                case 6:
                    libraryLogic.printMembers();
                    break;
            }

        } while (loop == 0);
    }
    private void menu (){
        System.out.println(" --- --- --- --- ---");
        System.out.println("| 1. Add Book       |");
        System.out.println("| 2. Remove Book    |");
        System.out.println("| 3. All Books      |");
        System.out.println("| 4. Add Member     |");
        System.out.println("| 5. Remove Member  |");
        System.out.println("| 6. All Members    |");
    }
}
