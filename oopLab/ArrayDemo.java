import java.util.*;

public class ArrayDemo {
    static int minVal(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {9, 3, 12, -4, 20, 30};
        System.out.println("Minimum value = " + minVal(a));
    }
}
