package Week3;


import java.sql.SQLOutput;

class Rectangle{
    int length;
    int breadth;
    int Area(int length, int breadth){
        int area = length*breadth;
        return area;
    }
    int Perimeter(int length, int breadth){
        int perimeter = 2*(length*breadth);
        return perimeter;
    }
}

public class RectProblem {
    public static void main (String[]args){
        Rectangle r1 = new Rectangle();
        System.out.println("Area=" + r1.Area(30,50));
        System.out.println("Perimeter="+r1.Perimeter(30,50));
    }
}
