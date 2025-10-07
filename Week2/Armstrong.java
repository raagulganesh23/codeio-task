package Week2;

public class Armstrong {
    public static void main(String[]args){
        int n =370;
        int original = n;
        int result=0;
        int ans=0;
        while (n>0){
            int lastNum= n%10;
            result = lastNum*lastNum*lastNum;
            n=n/10;
            ans=ans+result;

        }
        System.out.println(ans);
            if (ans==original) {
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not an Armstrong");
            }

    }
}
