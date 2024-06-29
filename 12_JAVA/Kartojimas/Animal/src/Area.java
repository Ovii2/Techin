public class Area {
    private double length;
    private double width;
    private Point point;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setPoint(Point point) {
        if (this.length >= point.getX() && this.width >= point.getY()) {
            this.point = point;
        } else {
            System.out.println("Error");
        }
    }

}
