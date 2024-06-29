package test;

import main.Rectangle;

import java.util.Locale;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.printf(Locale.US, "The area of a rectangle is %.2f%n", r1.getArea());
        System.out.printf(Locale.US, "The perimeter of a rectangle is %.2f%n", r1.getPerimeter());
        System.out.println(r1.toString());
        r1.setLength(8.5f);
        r1.setWidth(10.2f);
        System.out.printf(Locale.US, "new rectangle %f.2", r1.getArea());
    }
}
