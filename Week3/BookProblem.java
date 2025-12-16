package Week3;


class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(){
    }
}

public class BookProblem {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1.title +" "+ b1.author +" "+ b1.price);
        Book b2 = new Book("Top Performance","ZigZiggler", 540);
        System.out.println(b2.title +" "+ b2.author +" "+ b2.price);
    }
}
