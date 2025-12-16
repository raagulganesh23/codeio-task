package Week3;

class BankAccount{
    int accountNo = 12345;
    int balance;

    BankAccount(){
    }

    BankAccount(int balance){
        this.balance = balance;
    }
    int deposit(int depositAmt){
        balance +=depositAmt;
        return balance;
    }
    int withdraw(int withdrawAmt){
        balance -=withdrawAmt;
        return balance;

    }
}

public class BankDetails {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount();
        System.out.println(ac1.balance);
        BankAccount ac2 = new BankAccount(1000);
        System.out.println("Balance after deposit: "+ac2.deposit(500));
        System.out.println("Balance after withdrawal: "+ac2.withdraw(200));
    }
}
