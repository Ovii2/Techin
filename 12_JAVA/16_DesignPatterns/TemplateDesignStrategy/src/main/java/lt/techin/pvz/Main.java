package lt.techin.pvz;

public class Main {
    public static void main(String[] args) {
        Greeter LTgreeter = new LithuanianGreeter();
        Greeter ENgreeter = new EnglishGreeter();

        LTgreeter.greet("Jonas", "Jonaitis");
        System.out.println();
        ENgreeter.greet("Jonas", "Jonaitis");
    }
}