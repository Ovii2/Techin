public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.printf("%s barks%n", getName());
    }
    @Override
    public void makeNoise() {
        bark();
    }
}
