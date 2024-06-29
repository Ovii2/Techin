package test;

import main.Circle;

import java.util.Locale;

public class TestCircle {
    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        System.out.println("The circle has radius of " + c1.getRadius() + " and area " + c1.getArea());


//        Circle c2 = new Circle(2.0);
//        System.out.println("The circle has radius of " + c2.getRadius() + " and area " + c2.getArea());

        Circle c3 = new Circle(5, "red");
        System.out.printf(Locale.US, "The circle has radius of %.2f and area %.2f and color %s%n", c3.getRadius(), c3.getArea(), c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.printf(Locale.US, "Radius of c4 is %.2f%n", c4.getRadius());
        c4.setColor("yellow");
        System.out.printf("The color of c4 is %s", c4.getColor());

        Circle c1 = new Circle(5.0);
        System.out.println(c1.toString());

        Circle c2 = new Circle(1.2);
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c2);
    }
}
