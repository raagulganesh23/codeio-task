package Week3;
class Employee{
    private String name;
    private String id;
    private int salary;

    void setEmpDetails(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    String getEmpName(){
        return name;
    }
    String getEmpID(){
        return id;
    }
    int getEmpSalary(){
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpDetails("Raagul","40023922",100000);
        System.out.println("Name:"+emp1.getEmpName()+" "+"ID:"+emp1.getEmpID()+" "+"Salary:"+emp1.getEmpSalary());
    }
}
