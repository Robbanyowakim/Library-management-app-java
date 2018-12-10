package com.company;

import java.util.ArrayList;

public class Transaction {
   private int bookIndex;
    private int memberIndex;

    public Transaction(int memberIndex,int bookIndex) {
        this.bookIndex = bookIndex;
        this.memberIndex = memberIndex;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(int bookIndex) {
        this.bookIndex = bookIndex;
    }

    public int getMemberIndex() {
        return memberIndex;
    }

    public void setMemberIndex(int memberIndex) {
        this.memberIndex = memberIndex;
    }
}
