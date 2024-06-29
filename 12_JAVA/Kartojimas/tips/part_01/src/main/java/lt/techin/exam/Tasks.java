package lt.techin.exam;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {


    /* Paduotus duomenis kilometrais ir metrais konvertuoja į metrus ir rezultatą išveda į ekraną
     * pvz. kilometers = 4, meters = 67 =>
     * Atspausdina:
     * 4067 metrų
     */
    public static void convertToMeters(int kilometers, int meters) {
//        int kmInMeters = kilometers * 1000;
//        int totalMeters = kmInMeters + meters;
        int totalMeters = kilometers * 1000 + meters;
        System.out.println(totalMeters + " metrų");
    }

    /*Kasininkė grąžą pirkėjui pabėrė centais ct. Reikia apskaičiuoti kiek tai yra eurų  ir centų .
     * pvz. 234 ct => atspausdina:
     * Gauta: 2 Eur ir 34 ct
     */
    public static void convertCentsToEuros(int cents) {
//        int euros = 0;
//        if(cents == 100) {
//            euros =1;
//        }
        int euros = cents / 100;
        int leftCents = cents % 100;
        System.out.println("Gauta: " + euros + " Eur ir " + leftCents + " ct");
    }


    /* Raskite skaičių a, b ir c vidurkį
     */
    public static double averageOf(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }


    /* Duoti trys skaičiai. Parašykite metodą, kuris nustatytų, ar bent vienas iš jų yra lyginis.
    Pvz.:
     a = 1, b = 3, c = 5 => false
     a = 1, b = 3, c = 6 => true

    * */
    public static boolean isEven(int a, int b, int c) {
//        if (a % 2 == 0) {
//            return true;
//        } else if (b % 2 == 0) {
//            return true;
//        } else if (c % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
    }

    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }


    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }

    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > number) {
//                count++;
//            }
//        }
//        return count;

        return (int) Arrays.stream(array).filter(n -> n > number).count();

    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        return Collections.min(numbers);
    }


    /*
     * Paskaičiuokite kiek simbolių yra String'ų List'e
     */
    public static int countLettersInList(List<String> words) {
        return words.stream().mapToInt(String::length).sum();
    }


    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        return (int) strings.stream()
                .filter(s -> s.toLowerCase().contains(word.toLowerCase()))
                .count();
    }


    /*
     * Paskaičiuokite kiek liste elementų, kur savybė displayed yra true
     */
    public static int countDisplayedElements(List<Element> elements) {
        return (int) elements.stream().filter(Element::isDisplayed).count();
    }

    /*
     * Grąžinkite listą elementų kurių tekstas nėra tuščias arba sudarytas tik iš tarpų
     */
    public static List<Element> findElementsWithNonEmptyTexts(List<Element> elements) {
        return elements.stream()
                .filter(el -> el != null && el.getText() != null && !el.getText().trim().isEmpty())
                .collect(Collectors.toList());
    }


    /*
     * Elementų tekste užrašytos prekių kainos, pvz. "$10.52"
     * Raskite didžiausią kainą
     */
    public static double findSumOfPrices(List<Element> elements) {
        return elements.stream()
                .mapToDouble(el -> Double.parseDouble(el.getText().replace("$", "")))
                .sum();
    }

}
