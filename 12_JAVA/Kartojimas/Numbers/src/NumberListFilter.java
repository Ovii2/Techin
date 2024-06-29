import java.util.ArrayList;
import java.util.stream.Collectors;

public class NumberListFilter {

    public void numbersFilter(ArrayList<Integer> numbers) {
        ArrayList<Integer> filteredNumbers =
                numbers.stream().filter(n -> n < 5).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers);
    }
}
