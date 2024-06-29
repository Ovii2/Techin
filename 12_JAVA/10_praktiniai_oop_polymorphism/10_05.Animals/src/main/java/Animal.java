public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.printf("%s sleeps%n", name);
    }

    public void eat() {
        System.out.printf("%s eats%n", name);
    }

    public String getName() {
        return name;
    }
}
