package lt.techin.pvz;

public class Greeter {


    public GreeterLanguageStrategy greeterLanguageStrategy;

    public void setGreeterLanguageStrategy(GreeterLanguageStrategy strategy) {
        this.greeterLanguageStrategy = strategy;
    }


    public void greet(String firstName, String lastName) {
        System.out.printf("%s %s %s%n", greeterLanguageStrategy.getGreetingString(), firstName, lastName);
    }


}
