package com.company;

import java.io.Serializable;

public class Date implements Serializable {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        String x = "";
        switch (month){
            case 1:
                x = "January";
                break;
            case 2:
                x = "February";
                break;
            case 3:
                x = "Mars";
                break;
            case 4:
                x = "April";
                break;
            case 5:
                x = "May";
                break;
            case 6:
                x = "June";
                break;
            case 7:
                x = "July";
                break;
            case 8:
                x = "August";
                break;
            case 9:
                x = "September";
                break;
            case 10:
                x = "October";
                break;
            case 11:
                x = "November";
                break;
            case 12:
                x = "December";
                break;
        }

        return day+" " + x + " "+year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
