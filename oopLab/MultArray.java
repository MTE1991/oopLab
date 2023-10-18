import java.util.*;

public class MultArray {
    public static void main(String[] args) {
        int [][] arr = new int[4][5];
        for (int i = 0, k = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = k++;
            }
        }
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
