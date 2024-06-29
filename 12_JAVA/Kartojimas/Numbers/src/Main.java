public class Main {
    public static void main(String[] args) {
        WholeNumbers list = new WholeNumbers();

        for (int i = 1; i <= 10; i++) {
            list.addNumberToList(i);
        }
        System.out.println(list);
    }
}