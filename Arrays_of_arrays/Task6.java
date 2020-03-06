
/*   Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        *      1   1   1  ... 1   1   1
        *      0   1   1  ... 1   1   0
        *      0   0   1  ... 1   0   0
        *      .   .   .  ... .   .   .
        *      0   1   1  ... 1   1   0
        *      1   1   1  ... 1   1   1
        */
package by.epam_tc.step1.t2.type2;

import java.util.Scanner;

public class Task6 {
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 14;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1;
                matrix[n - i - 1][j] = 1;

            }
        }

        for (int i = 1; i < n / 2; i++) {
            int tmp = i;
            while (tmp > 0) {
                matrix[i][tmp - 1] = 0;
                matrix[n - i - 1][tmp - 1] = 0;
                matrix[i][n - tmp] = 0;
                matrix[n - i - 1][n - tmp] = 0;
                tmp--;
            }


        }
        System.out.println("полученная матрица:");
        showMatrix(matrix);
    }
}
