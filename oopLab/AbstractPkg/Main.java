package AbstractPkg;

interface MyInterface {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

abstract class MyAbstractClass implements MyInterface {
    public void method1() {
        System.out.println("Abstract class implements method1");
    }

    public void method2() {
        System.out.println("Abstract class implements method2");
    }
}

class MyConcreteClass extends MyAbstractClass {

    public void method3() {
        System.out.println("Concrete class implements method3");
    }

    public void method4() {
        System.out.println("Concrete class implements method4");
    }

    public void method5() {
        System.out.println("Concrete class implements method5");
    }
}

public class Main {
    public static void main(String[] args) {
        MyConcreteClass myObject = new MyConcreteClass();

        myObject.method1();
        myObject.method2();
        myObject.method3();
        myObject.method4();
        myObject.method5();
    }
}
