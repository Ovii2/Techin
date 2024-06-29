public class DuplicateTest {

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();

//        int[] arr = {2, 1, 3, 5, 3, 2};
//        int[] arr = {2, 2};
        int[] arr = {2, 4, 3, 5, 1};

        System.out.println(duplicate.firstDuplicate(arr));
    }

}
