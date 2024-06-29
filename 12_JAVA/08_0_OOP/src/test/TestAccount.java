package test;

import main.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("1", "Vardas", 5000);
        Account account2 = new Account("2", "Vardenis", 600);


        System.out.printf("Account 1 balance: %,d\u20ac%n", account.getBalance());
        System.out.printf("Account 2 balance before transfer: %,d\u20ac%n", account2.getBalance());
        account.transferTo(account2, 200);
        System.out.printf("Account 2 credit after transfer: %,d\u20ac%n", account2.getBalance());
    }
}
