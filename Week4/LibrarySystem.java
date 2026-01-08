package Week4;

class Book{
    String title;
    String author;
    int price;
}
class TextBook extends Book{
    int pages = 900;
}
class Magazine extends Book{
    int lifespan = 50;
}
public class LibrarySystem {
    public static void main (String[]args){
        TextBook t1 = new TextBook();
        Magazine m1 = new Magazine();
        t1.title = "TopPerformance";
        t1.author = "Zigziggler";
        t1.price = 1150;
        m1.title = "AtomicHabits";
        m1.author = "Christ";
        m1.price = 1900;
        System.out.println(t1.title+" "+t1.author+" "+t1.price+" "+t1.pages);
        System.out.println(m1.title+" "+m1.author+" "+m1.price+" "+m1.lifespan);
    }
}
