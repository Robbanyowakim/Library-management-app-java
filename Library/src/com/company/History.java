package com.company;

import java.io.Serializable;

public class History implements Serializable {
    private Book book;
    private Member member;
    private Date duedate;
    private Date date;

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getDuedate() {
        return duedate;
    }

    public Date getDate() {
        return date;
    }

    public History(Book book, Member member, Date date, Date duedate){
        this.book = book;
        this.member = member;
        this.date = date;
        this.duedate = duedate;
    }
}
