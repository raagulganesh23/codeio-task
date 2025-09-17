public class ReportCardTest {
    public static void main(String[] args){
        int marks = 45;
        if (marks>=90){
            System.out.println("A");
        } else if (marks>=75&&marks<90) {
            System.out.println("B");
        } else if (marks>=50&&marks<70) {
            System.out.println("C");
        } else if (marks<50) {
            System.out.println("Fail");
        }
    }
}
