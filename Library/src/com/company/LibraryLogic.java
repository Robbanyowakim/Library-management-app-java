package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryLogic {
    Scanner input = new Scanner(System.in);
    public ArrayList <Book> bookList = new ArrayList<>();
    public ArrayList <Member> memberList = new ArrayList<>();



    public  void addBook(){
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
        bookList.add(new Book(ISBN, name, numberOfPages, language, publisher, authorsList));
    }

    public void printBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Book " + i + ": Name: " + bookList.get(i).getName() + " ISBN: " + bookList.get(i).getISBN());
        }
    }


    public void addMember(){
        String name;
        String ssn;
        String address;
        String phoneNumber;
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter SSN: ");
        ssn = input.nextLine();
        System.out.println("Enter Address: ");
        address = input.nextLine();
        System.out.println("Enter phone number: ");
        phoneNumber = input.nextLine();
        memberList.add(new Member(ssn,name,address,phoneNumber));
    }

    public void removeMember(){
        String memberSSN;
        System.out.println("Enter SSN of member:");
        memberSSN = input.nextLine();
        for (int i=0;i<memberList.size();i++){
            if (memberList.get(i).getSsn().equals(memberSSN)){
                System.out.println("Removed "+memberList.get(i).getName()+" from system." );
                memberList.remove(i);

            }
        }
    }

    public void printMembers(){
        for (int i=0;i<memberList.size();i++){
            System.out.println("Member "+i+": "+memberList.get(i));
        }
    }

}

