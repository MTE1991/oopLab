import java.util.*;

class Human {
    public int age;
    private int weight;
    public String name;
    public int height; 

    public void getInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("weight = " + weight + "kg");
        System.out.println("height = " + height + "m");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

public class Oop {
    public static void main(String[] args) {
        Human ekleel = new Human();
        ekleel.name = "MT Ekleel";
        ekleel.height = 161;
        ekleel.age = 21;
        ekleel.setWeight(48);
        ekleel.getInfo();
    }
}
