interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() { System.out.println("Drawing rectangle..."); }
}

class Circle implements Drawable {
    public void draw() { System.out.println("Drawing circle..."); }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        // Drawable e = new Rectangle();
        // e.draw();
    }
} 

