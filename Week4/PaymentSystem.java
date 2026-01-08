package Week4;

interface Payment{
    default void Pay(int pAmount){
        System.out.println(pAmount);
    }
    default void Refund(int rAmount){
        System.out.println(rAmount);
    }
}
class CreditCardPayment implements Payment{
    @Override
    public void Pay(int pAmount) {
        Payment.super.Pay(pAmount);
    }
    public void Refund(int rAmount){
        Payment.super.Refund(rAmount);
    }
}
class UPIPayment implements Payment{
    @Override
    public void Pay(int pAmount) {
        Payment.super.Pay(pAmount);
    }
    public void Refund(int rAmount){
        Payment.super.Refund(rAmount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1=new CreditCardPayment();
        Payment p2 = new UPIPayment();
        p1.Pay(550);
        p1.Refund(200);
        p2.Pay(400);
        p2.Refund(1000);
    }
}
