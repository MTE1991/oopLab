package AreaPkg;

class Area {
    private int length;
    private int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area rect = new Area(2, 16);
        rect.getArea();   
    } 
}
