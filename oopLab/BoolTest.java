import java.util.*;

public class BoolTest {
    public static void main(String[] args) {
        boolean p;

        p = false;
        System.out.println("value of p = " + p);

        p = true;
        System.out.println("value of p = " + p);

        if (p) {
            System.out.println("This is executed.");
        } else {
            System.out.println("This is not executed.");
        }
    }
}
