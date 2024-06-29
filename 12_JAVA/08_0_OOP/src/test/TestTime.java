package test;

import main.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time(10, 20, 55);
        System.out.println(time1.nextSecond());
        System.out.println(time1.prevSecond());
    }
}
