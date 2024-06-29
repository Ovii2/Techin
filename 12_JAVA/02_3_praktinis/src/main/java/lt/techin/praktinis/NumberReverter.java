package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here
        int num3 = number % 10;
        int num2 = (number / 10) % 10;
        int num1 = (number / 100) % 10;

        int result = num3 * 100 + num2 * 10 + num1;

        System.out.println(result);

    }
}
