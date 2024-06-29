

public class Main {

    public static void main(String[] args) {
        // You can test your program here
//        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
//        coffeeBox.add(new Item("Saludro", 5));
//        coffeeBox.add(new Item("Pirkka", 5));
//        coffeeBox.add(new Item("Kopi Luwak", 5));
//
//        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
//        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
//        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        Box box = new OneItemBox();
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
//        System.out.println(box.isInBox(new Item("a")));
        System.out.println(box.isInBox(new Item("b")));
    }
}
