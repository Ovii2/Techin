public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        if (this.credits >= 0) {
            this.credits++;
        }
    }

    @Override
    public String toString() {
        return String.format("%s \n  %s \n  Study credits %d", this.getName(), this.getAddress(), this.credits);
    }
}
