interface Printable {
    void print();
}

interface Showable {
    void print();
}

public class MultiInh implements Printable, Showable {
    public void print() { System.out.println("Hello!"); }
    
    public static void main(String[] args) {
        MultiInh obj = new MultiInh();
        obj.print();
    }
}
