public class Main {
    public static void main(String[] args) {
//        Animal bird = new Animal();
//        bird.running();
//        Animal fish = new Animal();
//        fish.running();
//
//        Bird colibri = new Bird();
//        colibri.running();
//        Fish nemo = new Fish();
//        nemo.running();

        Area newArea = new Area(10, 10);
        Point myPoint = new Point(0, 0);

        newArea.setPoint(myPoint);
        myPoint.move(5,5);
        if (myPoint.getX() >= newArea.getLength()){
            System.out.println("can't move");
        }
        double x = 10;
        double y = 20;
        myPoint.move(x, y);

        System.out.println(myPoint);
    }
}