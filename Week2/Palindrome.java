package Week2;

public class Palindrome {
    public static void main(String[]args){
        int n =1221;
        int original = n;
        int result =0;
        while (n>0){
            int digit = n%10;
            n=n/10;
            result=result*10+digit;
        }
        System.out.println(result);
        if (result==original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
