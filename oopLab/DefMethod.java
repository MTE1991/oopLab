interface Drawables {
    void draw();
    default void msg() { System.out.println("Default method."); }
}

class Rectangles implements Drawables {
    public void draw() { System.out.println("Drawing rectangle."); }
}

public class DefMethod {
    public static void main(String[] args) {
        Drawables d = new Rectangles();
        d.draw();
        d.msg();
    }    
}
