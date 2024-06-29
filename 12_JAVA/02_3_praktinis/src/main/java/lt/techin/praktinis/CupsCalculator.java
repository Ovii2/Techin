package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int fullBoxes = numberOfCups / 3;
        int remainingCups = numberOfCups % 3;

        System.out.println("Dėžių: " + fullBoxes);
        System.out.println("Liko puodelių: " + remainingCups);
    }

}
