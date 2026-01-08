package Week4;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name =name;
        this.rollNo =rollNo;
        this.marks =marks;
    }
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }
}
public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Raagul",456,94);
        Student s1Copy = new Student(s1);
        s1Copy.name = "Ganesh";
        System.out.println(s1.name);

    }
}