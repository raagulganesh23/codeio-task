package Week4;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x =x;
        this.y =y;
    }
    Point(Point p1){
        this.x =p1.x;
        this.y =p1.y;
    }
}
public class PointClass {
    public static void main(String[] args) {
        Point p1 = new Point(5,8);
        Point p1Copy1 =  new Point(p1);
        Point p1Copy2 =  new Point(p1);
        p1Copy1.x =10;
        p1Copy1.y = 12;
        p1Copy2.x =20;
        p1Copy2.y = 22;
        System.out.println(p1.x +" " + p1.y);
        System.out.println(p1Copy1.x +" " + p1Copy1.y);
        System.out.println(p1Copy2.x +" " + p1Copy2.y);
    }
}