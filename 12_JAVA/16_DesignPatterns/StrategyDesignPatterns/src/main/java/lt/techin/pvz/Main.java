package lt.techin.pvz;

public class Main {
    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        greeter.setGreeterLanguageStrategy(new LithuanianGreetingStrategy());
        greeter.greet("Jonas", "Jonaitis");

        greeter.setGreeterLanguageStrategy(new EnglishGreetingStrategy());
        greeter.greet("Jonas", "Jonaitis");

        //GreeterLanguageStrategy french = () -> "Bonjour";

        greeter.setGreeterLanguageStrategy(() -> "Bonjour");
        greeter.greet("Jonas", "Jonaitis");
    }
}