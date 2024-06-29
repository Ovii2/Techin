package lt.techin.ovidijus;

public class GreeterImpl implements Greeter {
    @Override
    public String greet(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }
}
