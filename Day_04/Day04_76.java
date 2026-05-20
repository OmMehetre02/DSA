//76 Print matrix in wave form — 

import java.util.*;

  public class Day04_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3, m = 3;
        int[][] a = new int[n][m];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Wave form:");
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                // top to bottom
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                // bottom to top
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}