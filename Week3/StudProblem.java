package Week3;

class Student{
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class StudProblem {
    public static void main(String[] args) {
        Student s1 = new Student("Raagul", 20, 97);
        Student s2 = new Student("Subash", 21, 70);
        Student s3 = new Student("Bhai",22,55);
        System.out.println("Name:"+s1.name +" " +"RollNo:"+s1.rollNo +" "+ "Marks:"+s1.marks);
        System.out.println("Name:"+s2.name +" " +"RollNo:"+s2.rollNo +" "+ "Marks:"+s3.marks);
        System.out.println("Name:"+s3.name +" " +"RollNo:"+s3.rollNo +" "+ "Marks:"+s3.marks);
    }
}
