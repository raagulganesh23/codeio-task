public class GradeCalculator {
    public static void main(String[] args){
        int studentMark = 49;
        if (studentMark>=90){
            System.out.println("GradeA");
        } else if (studentMark>=75&&studentMark<=89){
            System.out.println("GradeB");
        } else if (studentMark>=50&&studentMark<=74) {
            System.out.println("GradeC");
        } else if (studentMark<50){
            System.out.println("Fail");
        }
    }
}
