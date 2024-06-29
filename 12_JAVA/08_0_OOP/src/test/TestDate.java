package test;

import main.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(1,6,2024);
        System.out.println(date.getFormattedDate());
        date.setDay(30);
        date.setMonth(11);
        date.setYear(2011);
        System.out.println(date.getFormattedDate());
    }
}
