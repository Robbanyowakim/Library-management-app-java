package com.company;

import java.util.ArrayList;

public class Transaction extends LibraryLogic {

    private int bookIndex;
    private int memberIndex;
    private Date dateOfIssue;
    private Date dueDate;
    private Date returnedDate;
    private double lateFee;
    public ArrayList<Transaction> transactionList = new ArrayList<>();

    Transaction(){

    }

    Transaction(int book, int member, Date dateOfIssue, Date dueDate){
        this.bookIndex = book;
        this.memberIndex = member;
        this.dateOfIssue = dateOfIssue;
        this.dueDate = dueDate;
    }

    public void issueBook(){
        int day;
        int month;
        int xmonth;
        int year;

        System.out.println("You are about to issue a book");
        System.out.println("Enter Index of member");
        memberIndex = input.nextInt();
        input.nextLine();

        System.out.println("Enter Index of book to issue");
        bookIndex = input.nextInt();
        input.nextLine();

        System.out.println("What day is it today? (DD)");
        day = input.nextInt();
        input.nextLine();
        System.out.println("What Month is it? (MM)");
        month = input.nextInt();
        input.nextLine();
        System.out.println("What Year is it? (YYYY)");
        year = input.nextInt();
        input.nextLine();

        xmonth = month;

        if (xmonth==12){
            xmonth = 0;
        }


        this.dateOfIssue =(new Date(year,month,day));
        this.dueDate =(new Date(year,xmonth+1,day));

        Transaction Trans =(new Transaction(bookIndex,memberIndex,dateOfIssue,dueDate));

        transactionList.add(Trans);


    }

    private int getBook(String isbn){
        int x = 0;
       for (int i=0;i<bookList.size();i++){
           if (bookList.get(i).getISBN().equals(isbn)){
               System.out.println(bookList.get(i));
               x = i;
           }
       }
        return x;
    }
    private int getMember(String ssn){
        int x = 0;
        for (int i=0;i<memberList.size();i++){
            if (memberList.get(i).getSsn().equals(ssn)){
                System.out.println(memberList.get(i));
                x = i;
            }
        }
        return x;
    }
    public void printTransactions(){
        for (int i=0;i<transactionList.size();i++){
            System.out.println(transactionList.get(i));
        }
    }

    @Override
    public String toString() {
        return "Member";
    }
}
