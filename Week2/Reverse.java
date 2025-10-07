package Week2;

public class Reverse {
    public static void main(String[]args){
        int n = 12345;
        int lastNum=0;
        while(n>0){
            lastNum = n%10;
            n=n/10;
            System.out.print(lastNum);

        }

    }
}
