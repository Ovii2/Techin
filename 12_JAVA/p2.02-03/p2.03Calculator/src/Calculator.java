public class Calculator {

    private Reader reader = new Reader();
    private int count = 0;

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of the values: " + sum);
        count++;

    }

    private void difference() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int diff = value1 - value2;
        System.out.println("difference of the values: " + diff);
        count++;
    }

    private void product() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int prod = value1 * value2;
        System.out.println("product of the values: " + prod);
        count++;
    }

    private void statistics() {
        System.out.println("Calculations done " + count);
    }
}
