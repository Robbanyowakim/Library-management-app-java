package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryLogic {
    Scanner input = new Scanner(System.in);
    public ArrayList <Book> bookList = new ArrayList<>();
    public ArrayList <Member> memberList = new ArrayList<>();
    public ArrayList <Transaction> transactionList = new ArrayList<>();


    public void addTransaction(){
        int bookIndex;
        int memberIndex;

        int day;
        int month;
        int monthx;
        int year;
        int yearx;

        System.out.println("You are about to issue a book to a member");
        printMembers();
        System.out.println("Enter Member Index: ");
        memberIndex = input.nextInt();
        printBooks();
        System.out.println("Enter Book Index: ");
        bookIndex = input.nextInt();
        System.out.println("What year is it?(YYYY)");
        year = input.nextInt();
        input.nextLine();
        System.out.println("What month is it?(MM)");
        month = input.nextInt();

        input.nextLine();
        System.out.println("What day is it?(DD)");
        day = input.nextInt();
        input.nextLine();

        yearx = year;
        monthx = month;
        if (monthx==12){
            monthx=0;
            yearx++;
        }


        Date transactionDate = new Date(year,month,day);
        Date dueDate = new Date(yearx,monthx+1,day);

        Transaction transaction = new Transaction(memberIndex,bookIndex,transactionDate,dueDate);
        transactionList.add(transaction);
        System.out.println("Success!");
    }

    public void printTransactions(){
        if (transactionList.size()>0){
        for (int i=0;i<transactionList.size();i++) {
            System.out.println("Transaction [" + i + "]" + "                  Issued: " + transactionList.get(i).getTransactionDate() + " || Return date: " + transactionList.get(i).getDueDate());
            System.out.println("Member [" + transactionList.get(i).getMemberIndex() + "] " + memberList.get(transactionList.get(i).getMemberIndex()));
            System.out.println("Book [" + transactionList.get(i).getBookIndex() + "] " + bookList.get(transactionList.get(i).getBookIndex()));
            System.out.println();
        }
        }else{
            System.out.println("--- No transactions found ---");
        }
    }

    public void lookupMember(){
        String choice;
        System.out.println("You are about to lookup a member");
        System.out.println("Enter Member SSN(YYMMDD-XXXX):");
        choice = input.nextLine();


        for (int i=0;i<memberList.size();i++){
            if (memberList.get(i).getSsn().equals(choice)){
                System.out.println("Member ["+i+"] "+memberList.get(i));
                System.out.println();
                for (int j=0;j<transactionList.size();j++){
                    if (transactionList.get(j).getMemberIndex()==i){
                        System.out.println("Transaction [" + j + "]" + "                  Issued: " + transactionList.get(j).getTransactionDate() + " || Return date: " + transactionList.get(j).getDueDate());
                        System.out.println("Book [" + transactionList.get(j).getBookIndex() + "] " + bookList.get(transactionList.get(j).getBookIndex()));
                        System.out.println();
                    }
                }
            }
        }

    }

    public void returnBook(){
        int choice;
        System.out.println("You are about to return a book");
        printTransactions();
        System.out.println("Enter Transaction-number to return book:");
        choice = input.nextInt();
        input.nextLine();

        transactionList.remove(choice);
        System.out.println("Success!");
    }

    public void extendBook() {
        if (transactionList.size() > 0) {
            int choice;
            System.out.println("You are about to extend due-date");
            printTransactions();
            System.out.println("Enter transaction-number to extend by a month:");
            choice = input.nextInt();
            input.nextLine();

            if (transactionList.get(choice).getDueDate().getMonth() == 12) {
                transactionList.get(choice).getDueDate().setMonth(1);
                transactionList.get(choice).getDueDate().setYear(transactionList.get(choice).getDueDate().getYear() + 1);
            } else {
                transactionList.get(choice).getDueDate().setMonth(transactionList.get(choice).getDueDate().getMonth() + 1);
            }
            System.out.println("Success!");
        }else {
            System.out.println("--- No transactions found ---");
        }
    }
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
            System.out.println("--- List of books empty ---");
        }
    }

    public void removeBook (){
        printBooks();
        System.out.print("What book would you like to remove? (enter index number) ");
        int remove = input.nextInt();
        input.nextLine();
        for (int i=0;i<transactionList.size();i++){

            if (transactionList.get(i).getBookIndex()==remove){
                System.out.println("Removed Transaction "+i);
                transactionList.remove(i);
                i--;
            }
        }
        System.out.println("Removed book "+remove);
        bookList.remove(remove);
        System.out.println("Success!");
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
                bookList.get(choice).setLanguage(newLanguage);
                break;
            case 5:
                System.out.println("Old Publisher: " + bookList.get(choice).getPublisher());
                System.out.print("Enter new Publisher: ");
                String newPublisher = input.nextLine();
                bookList.get(choice).setPublisher(newPublisher);
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
        System.out.println("Success!");
    }
    public void searchBook(){
        System.out.println("--- What do you want to search for? ---");
        System.out.println("1. Book name");
        System.out.println("2. Author name");
        System.out.print("Your choice: ");
        int action = input.nextInt();
        input.nextLine();
        switch (action){
            case 1:
                System.out.print("Enter book name:");
                String searchName = input.nextLine();
                int count = 0;

                for (int i=0;i<bookList.size();i++){
                    if (bookList.get(i).getName().equals(searchName)) {
                        System.out.println("--- Info about the book ---");
                        System.out.println("Name: " + bookList.get(i).getName());
                        System.out.println("ISBN: " + bookList.get(i).getISBN());
                        System.out.println("Number of pages: " + bookList.get(i).getNumberOfPages());
                        System.out.println("Language: " + bookList.get(i).getLanguage());
                        System.out.println("Publisher: " + bookList.get(i).getPublisher());
                        System.out.println("Authors: " + bookList.get(i).getAuthors());
                        System.out.println("Index: " + i);
                        count = count + 1;
                        break;
                    }
                    }
                    if (count == 0){
                        System.out.println("--- No book with that name ---");
                    }

                break;
            case 2:
                System.out.print("Enter the authors name: ");
                String searchAuthors = input.nextLine();
                int count1 = 0;

                for (int i=0;i<bookList.size();i++){
                    if (bookList.get(i).getAuthors().contains(searchAuthors)) {
                        System.out.println("--- Info of the book ---");
                        System.out.println("Name: " + bookList.get(i).getName());
                        System.out.println("ISBN: " + bookList.get(i).getISBN());
                        System.out.println("Number of pages: " + bookList.get(i).getNumberOfPages());
                        System.out.println("Language: " + bookList.get(i).getLanguage());
                        System.out.println("Publisher: " + bookList.get(i).getPublisher());
                        System.out.println("Authors: " + bookList.get(i).getAuthors());
                        count1++;
                        break;
                    }
                }
                if (count1 == 0){
                    System.out.println("--- No book with that authors ---");
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
        System.out.print("Enter SSN(YYMMDD-XXXX): ");
        ssn = input.nextLine();
        System.out.print("Enter Address: ");
        address = input.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = input.nextLine();
        memberList.add(new Member(ssn,name,address,phoneNumber));
    }

    public void removeMember(){
        int memberIndex;
        System.out.println("Enter index of member:");
        memberIndex = input.nextInt();
        input.nextLine();
        for (int i=0;i<transactionList.size();i++){
            if (transactionList.get(i).getMemberIndex()==memberIndex){
                System.out.println("Removed Transaction "+i);
                transactionList.remove(i);
                i--;
            }
        }
        System.out.println("Removed Member "+memberIndex);
        memberList.remove(memberIndex);
        System.out.println("Success!");
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
            System.out.print("Enter member index to edit: ");
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
                    System.out.print("Enter new SSN(YYMMDD-XXXX): ");
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
            System.out.println("Success!");
        }else{
            System.out.println("List of members empty");
        }


    }

}

