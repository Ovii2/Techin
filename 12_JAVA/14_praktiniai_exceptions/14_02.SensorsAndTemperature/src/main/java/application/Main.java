package application;


public class Main {
    public static void main(String[] args) {
        Sensor s1 = new TemperatureSensor();
        s1.setOn();
        System.out.println(s1.isOn());

        AverageSensor s2 = new AverageSensor();
        System.out.println(s2.isOn());

    }
}
