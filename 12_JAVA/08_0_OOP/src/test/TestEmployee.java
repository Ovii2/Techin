package test;

import main.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Vardas", "Pavarde", 2000);
        System.out.printf("Annual salary: %,d\u20ac%n", employee.getAnnualSalary());
        System.out.printf("Monthly salary after raise: %,d\u20ac%n", employee.raiseSalary(10));
        System.out.println(employee);
    }
}
