package Week4;

class Person{
    String name;
    int age;
}
class Students extends Person{
    int marks;
    char grade;
}
class GraduateStudent extends Students{
    String researchTopic;
}

public class StudentGrading {
    public static void main(String[] args) {
        Students s1 = new Students();
        GraduateStudent gs1 = new GraduateStudent();
        gs1.name = "Raagul";
        gs1.age = 28;
        gs1.marks = 97;
        gs1.grade = 'A';
        gs1.researchTopic = "AI Vs AGI";
        System.out.println("Name:"+gs1.name+" Age:"+gs1.age+" Mark:"+gs1.marks+" Grade:"+gs1.grade+" ResearchTopic:"+gs1.researchTopic);
    }
}
