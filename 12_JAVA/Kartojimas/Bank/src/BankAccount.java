public class BankAccount {
    private AccountType type;
    private String AccountNumber;
    private String Owner;
    private double balance;

//    public BankAccount(String accountNumber, String owner) {
//        AccountNumber = accountNumber;
//        Owner = owner;
//        this.balance = 0.0;
//    }


    public BankAccount(AccountType type, String accountNumber, String owner) {
        this.type = type;
        AccountNumber = accountNumber;
        Owner = owner;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Money added...");
        } else {
            System.out.println("Money must be greater than 0");
        }
    }

    public boolean withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }
}
