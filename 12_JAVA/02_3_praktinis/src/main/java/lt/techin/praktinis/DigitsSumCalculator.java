package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Write your program here
        int num4 = number % 10;
        int num3 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num1 = number / 1000;

        System.out.println(num1 + num2 + num3 + num4);
    }
}
