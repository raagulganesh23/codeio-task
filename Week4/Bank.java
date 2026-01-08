package Week4;

abstract class BankAccount {
    protected int balance = 2000;

    abstract boolean deposit(int amount);
    abstract boolean withdraw(int amount);
}

class SavingsAccount extends BankAccount {
    private static final int MIN_BALANCE = 2000;

    @Override
    boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
            return true;
        }
        return false;
    }

    @Override
    boolean withdraw(int amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
            return true;
        }
        System.out.println("Cannot withdraw: Minimum balance ₹" + MIN_BALANCE + " required");
        return false;
    }
}

class CurrentAccount extends BankAccount {
    private static final int OVERDRAFT_LIMIT = -5000;

    @Override
    boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
            return true;
        }
        return false;
    }

    @Override
    boolean withdraw(int amount) {
        if (amount > 0 && balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
            return true;
        }
        System.out.println("Cannot withdraw: Overdraft limit ₹" + OVERDRAFT_LIMIT);
        return false;
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.withdraw(2000);


        BankAccount current = new CurrentAccount();
        current.deposit(1000);
        current.withdraw(8000);
        current.withdraw(10000);
    }
}
