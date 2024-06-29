public class Shapes {
    private String color = "red";
    private boolean filled = true;

    public Shapes() {
    }

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A shape with color of %s and %s", this.color, this.filled ? "filled" : "not filled");
    }

}
