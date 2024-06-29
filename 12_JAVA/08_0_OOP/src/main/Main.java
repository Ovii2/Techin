package main;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf(Locale.US, "Area of the circle: %.2f", circle.getArea());
    }
}