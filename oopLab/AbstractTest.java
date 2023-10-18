abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle...");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
