package test;

import main.SimpleCircle;

import java.util.Locale;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle c1 = new SimpleCircle();
        System.out.printf(Locale.US, "The area of a circle is %.2f%n", c1.getArea());
        System.out.printf(Locale.US, "The circumference of a circle is %.2f%n", c1.getCircumference());
    }
}
