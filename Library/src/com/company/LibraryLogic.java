package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryLogic {
    Scanner input = new Scanner(System.in);
    public ArrayList <Book> bookList = new ArrayList<>();
    public ArrayList <Member> memberList = new ArrayList<>();

    public Book addBooks (String ISBN,String name,int numberOfPages,String language, String publisher,ArrayList authorsList){
        Book newBook = new Book(ISBN,name,numberOfPages,language,publisher,authorsList);
        return newBook;
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

