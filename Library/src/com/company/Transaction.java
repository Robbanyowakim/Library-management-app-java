package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Transaction implements Serializable {
   private int bookIndex;
    private int memberIndex;
    private Date transactionDate;
    private Date dueDate;

    public Transaction(int memberIndex,int bookIndex, Date transactionDate, Date dueDate) {
        this.bookIndex = bookIndex;
        this.memberIndex = memberIndex;
        this.transactionDate = transactionDate;
        this.dueDate = dueDate;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public int getMemberIndex() {
        return memberIndex;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
