package Week2;

public class Pyramid {
    public static void main (String[] args){
        int n = 5;
        int a=n-1;
        int y=1;
        String x= " ";
        for (int i=1; i<=n; i++){
            for(int k=1; k<=a;k++) {
                System.out.print(x);
            }
           for(int j =1;j<=y;j++){
               System.out.print("*");
           }
           a=a-1;
           y=y+2;
           System.out.println();
        }
    }
}
