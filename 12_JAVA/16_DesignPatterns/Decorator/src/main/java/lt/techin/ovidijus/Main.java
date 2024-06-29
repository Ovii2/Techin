package lt.techin.ovidijus;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new GreeterImpl();
        Greeter exclamationMarked = new GreeterExclamationMarkDecorator(greeter);
        Greeter upperCased = new GreeterUpperCaseDecorator(greeter);
        System.out.println(greeter.greet("Vardenis", "Pavardenis"));
        System.out.println(exclamationMarked.greet("Test", "Tested"));
        System.out.println(upperCased.greet("Test", "Tested"));


    }
}