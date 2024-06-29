package lt.techin.pvz;

public abstract class Greeter {
    public void greet(String firstName, String lastName) {
        System.out.printf("%s %s %s%n", getGreetingString(), firstName, lastName);
    }

    protected abstract String getGreetingString();

}
