public class CustomTacoBox implements TacoBox {
    private int initialTacos;

    public CustomTacoBox(int tacos) {
        this.initialTacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.initialTacos;
    }

    @Override
    public void eat() {
        if (this.initialTacos > 0) {
            this.initialTacos--;
        }
    }

    @Override
    public String toString() {
        return String.format("Tacos left in the box: %d", this.initialTacos);
    }
}
