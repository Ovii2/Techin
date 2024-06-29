import java.util.ArrayList;

public class WholeNumbers {
    /* Sukurkite Java klasę / objektą, kuri gali saugoti sveikuosius skaičius. Įtraukite į šį sąrašą skaičius
     nuo 1 iki 10, tada atspausdinkite visą sąrašą ekrane. Sąrašui realizuoti naudokite ArrayList.*/
    private ArrayList<Integer> numberList = new ArrayList<>();

    public void addNumberToList(int n) {
            numberList.add(n);
    }

    @Override
    public String toString() {
        return "WholeNumbers{" +
                "numberList=" + numberList +
                '}';
    }
}
