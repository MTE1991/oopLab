class Operation {
    int data = 50;
    public void change(Operation obj) {
        obj.data += 100;
    }
}

public class CallByVal {
    public static void main(String[] args) {
        Operation obj1 = new Operation();
        System.out.println("Before change = " + obj1.data);
        obj1.change(obj1);
        System.out.println("After change = " + obj1.data);
    }
}
