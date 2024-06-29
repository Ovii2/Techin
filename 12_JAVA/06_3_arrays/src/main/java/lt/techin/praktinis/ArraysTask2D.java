package lt.techin.praktinis;

import java.math.BigDecimal;

public class ArraysTask2D {

    public static void main(String[] args) {

        // (Papildomai) Įgyvendikite visus metodus (turi pažaliuoti unit testai).
        //  Pateiktas dvimatis masyvas programos patikrinimui. Elementų reikšmes galite keisti.

        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %.2f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }


    public static double getAverageMark(int[][] marks) {
        //TODO
        int counter = 0;
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
                counter++;
            }
        }
        return sum / counter;
    }


    public static int getMinMark(int[][] marks) {
        //TODO
        int min = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < min) {
                    min = marks[i][j];
                }
            }
        }
        return min;
    }


    public static int getMaxMark(int[][] marks) {
        //TODO
        int max = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
        }
        return max;
    }
}
