public class Main {
    public static void main(String[] args) {
        Shapes sh = new Shapes("blue", false);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        Square square = new Square(2);

        System.out.println(sh);
    }
}