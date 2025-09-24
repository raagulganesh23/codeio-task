package Week1;

public class ElectricityBill {
    public static void main(String[] args){
        int familyBill = 550;//Units - Rupees
        float x;
        if (familyBill > 1000){
            x= 10/100f;
            float finalBill = familyBill*x;
            System.out.println(familyBill-finalBill);
        }
        else if (familyBill>=500&&familyBill<=1000){
            x = 5/100f;
            float finalBill = familyBill*x;
            System.out.println(familyBill-finalBill);
        }
        else{
            System.out.println(familyBill);
        }

    }
}
