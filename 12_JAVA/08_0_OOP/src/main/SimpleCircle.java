package main;

public class SimpleCircle {
    private double radius;

    public SimpleCircle() {
        this.radius = 1.0;
    }

    public SimpleCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }
}
