package Week1;

public class TreasureTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 75;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }

        }

    }
}
