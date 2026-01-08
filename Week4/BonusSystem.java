package Week4;

class Employee{
    int bonus = 10000;
    int getBonus(int bonus){
        return bonus;
    }
}
class Manager extends Employee{
    @Override
    int getBonus(int bonus){
        this.bonus=bonus;
        return bonus;
    }
}
class Developer extends Employee{
    @Override
    int getBonus(int bonus){
        this.bonus=bonus;
        return bonus;
    }
}

public class BonusSystem {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();
        System.out.println(emp1.getBonus(25000));
        System.out.println(emp1.getBonus(15000));
    }

}
