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
        System.out.print("Enter the language of the book: ");
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
        if (bookList.size()>0){
        System.out.println("---Books---");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Book ["+i+"]"+bookList.get(i));
        }
        }else{
            System.out.println("List of books empty");
        }
    }

    public void removeBook (){
        printBooks();
        System.out.print("What book would you like to remove? (enter index number) ");
        int remove = input.nextInt();
        bookList.remove(remove);
    }

    public void editBook (){
        printBooks();
        System.out.print("What book would you like to edit? (enter index number) ");
        int choice = input.nextInt();
        System.out.println("What would you like to edit?");
        System.out.println("1. Name: " + bookList.get(choice).getName());
        System.out.println("2. ISBN: " + bookList.get(choice).getISBN());
        System.out.println("3. Number of pages: " + bookList.get(choice).getNumberOfPages());
        System.out.println("4. Language: " + bookList.get(choice).getLanguage());
        System.out.println("5. Publisher: " + bookList.get(choice).getPublisher());
        System.out.println("6. Authors: " + bookList.get(choice).getAuthors());
        int edit = input.nextInt();
        input.nextLine();
        switch (edit){
            case 1:
                System.out.println("Old name: " + bookList.get(choice).getName());
                System.out.print("Enter new name: ");
                String newName = input.nextLine();
                bookList.get(choice).setName(newName);
                break;
            case 2:
                System.out.println("Old ISBN: " + bookList.get(choice).getISBN());
                System.out.print("Enter new ISBN: ");
                String newIBSN = input.nextLine();
                bookList.get(choice).setISBN(newIBSN);
                break;
            case 3:
                System.out.println("Old number of pages: " + bookList.get(choice).getNumberOfPages());
                System.out.print("Enter new number of pages: ");
                int newPages = input.nextInt();
                input.nextLine();
                bookList.get(choice).setNumberOfPages(newPages);
                break;
            case 4:
                System.out.println("Old Language: " + bookList.get(choice).getLanguage());
                System.out.print("Enter new Language: ");
                String newLanguage = input.nextLine();
                bookList.get(choice).setISBN(newLanguage);
                break;
            case 5:
                System.out.println("Old Publisher: " + bookList.get(choice).getPublisher());
                System.out.print("Enter new Publisher: ");
                String newPublisher = input.nextLine();
                bookList.get(choice).setISBN(newPublisher);
                break;
            case 6:
                System.out.println("Old Authors: " + bookList.get(choice).getAuthors());
                System.out.print("Enter how many authors: ");
                int authorsNum = input.nextInt();
                input.nextLine();
                ArrayList<String> newAuthors = new ArrayList<>();
                for (int i = 1; i <= authorsNum; i++) {
                    System.out.printf("[%d] authors name: \n", i);
                    String authorsName = input.nextLine();
                    newAuthors.add(authorsName);
                }
                for (int i=0;i<bookList.get(choice).getAuthors().size();i++){
                    bookList.get(choice).getAuthors().remove(0);
                }
                bookList.get(choice).setAuthors(newAuthors);
                break;

        }
    }
    public void searchBook(){
        System.out.println("--- What do you want to search for? ---");
        System.out.println("1. Book name");
        System.out.println("2. Author name");
        int action = input.nextInt();
        input.nextLine();
        switch (action){
            case 1:
                System.out.print("Enter book name:");
                String searchName = input.nextLine().toUpperCase();

                for (Book book : bookList){
                    if (book.getName().compareTo(searchName) > 0){
                        System.out.println("--- Info of the book ---");
                        System.out.println("Name: " + book.getName());
                        System.out.println("ISBN: " + book.getISBN());
                        System.out.println("Number of pages: " + book.getNumberOfPages());
                        System.out.println("Language: " + book.getLanguage());
                        System.out.println("Publisher: " + book.getPublisher());
                        System.out.println("Authors: " + book.getAuthors());
                        break;
                    }
                    else if (book.getName().compareTo(searchName) == 0){
                        System.out.println("--- No book with that name ---");
                        break;
                    }
                }
            case 2:
                System.out.print("Enter the authors name: ");
                String searchAuthors = input.nextLine().toUpperCase();

                for (Book authors : bookList){
                    if (authors.getName().compareTo(searchAuthors) > 0){
                        System.out.println("--- Info of the book ---");
                        System.out.println("Name: " + authors.getName());
                        System.out.println("ISBN: " + authors.getISBN());
                        System.out.println("Number of pages: " + authors.getNumberOfPages());
                        System.out.println("Language: " + authors.getLanguage());
                        System.out.println("Publisher: " + authors.getPublisher());
                        System.out.println("Authors: " + authors.getAuthors());
                        break;
                    }
                    else if (authors.getName().compareTo(searchAuthors) == 0){
                        System.out.println("--- No authors with that name ---");
                        break;
                    }
                }

        }
    }


    public void addMember(){
        String name;
        String ssn;
        String address;
        String phoneNumber;

        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter SSN: ");
        ssn = input.nextLine();
        System.out.print("Enter Address: ");
        address = input.nextLine();
        System.out.print("Enter phone number: ");
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
        if (this.memberList.size()>0) {
            System.out.println("---Members---");
        for (int i=0;i<memberList.size();i++){
            System.out.println("Member ["+i+"] "+memberList.get(i));
        }
        }else{
            System.out.println("List of members empty");
        }
    }

    public void editMember(){
        int choice;
        int tmpchoice;

        if (this.memberList.size()>0) {
            this.printMembers();
            System.out.print("Enter member number to edit: ");
            choice = input.nextInt();
            input.nextLine();
            System.out.println("What do you want to edit?");
            System.out.println("1. Name: " + this.memberList.get(choice).getName());
            System.out.println("2. SSN: " + this.memberList.get(choice).getSsn());
            System.out.println("3. Address: " + this.memberList.get(choice).getAddress());
            System.out.println("4. Phone number: " + this.memberList.get(choice).getPhoneNumber());
            tmpchoice = input.nextInt();
            input.nextLine();
            switch (tmpchoice) {
                case 1:
                    System.out.println("Old name: " + this.memberList.get(choice).getName());
                    System.out.print("Enter new name: ");
                    this.memberList.get(choice).setName(input.nextLine());
                    break;
                case 2:
                    System.out.println("Old SSN: " + this.memberList.get(choice).getSsn());
                    System.out.print("Enter new SSN: ");
                    this.memberList.get(choice).setSsn(input.nextLine());
                    break;
                case 3:
                    System.out.println("Old address: " + this.memberList.get(choice).getAddress());
                    System.out.print("Enter new address: ");
                    this.memberList.get(choice).setAddress(input.nextLine());
                    break;
                case 4:
                    System.out.println("Old phone number: " + this.memberList.get(choice).getName());
                    System.out.print("Enter new phone number: ");
                    this.memberList.get(choice).setPhoneNumber(input.nextLine());
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }else{
            System.out.println("List of members empty");
        }


    }

}

