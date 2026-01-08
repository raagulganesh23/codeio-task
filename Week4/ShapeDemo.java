package Week4;

// Base abstract class
abstract class Shape {
    abstract double area();
}

// Circle implementation
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle implementation
class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Triangle implementation
class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main demonstration class
public class ShapeDemo {
    public static void main(String[] args) {
        // Store different shapes in Shape array (Runtime polymorphism)
        Shape[] shapes = {
                new Circle(5),           // π×5² = 78.54
                new Rectangle(4, 6),     // 4×6 = 24.00
                new Triangle(3, 8),      // 0.5×3×8 = 12.00
                new Circle(3),           // π×3² = 28.27
                new Rectangle(2, 10)     // 2×10 = 20.00
        };

        System.out.println("Shape Areas (Runtime Polymorphism):");
        System.out.println("==================================");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}

