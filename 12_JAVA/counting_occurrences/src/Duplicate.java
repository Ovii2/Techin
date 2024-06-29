import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public int firstDuplicate(int[] a) {
        Set<Integer> result = new HashSet<>();

        for (int i : a) {
            if (result.contains(i)) {
                return i;
            }
            result.add(i);
        }
        return -1;
    }
}
