/*   Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        *      1   1   1  ... 1   1   1
        *      2   2   2  ... 2   2   0
        *      3   3   3  ... 3   0   0
        *      .   .   .  ... .   .   .
        *     n-1 n-1  0  ... 0   0   0
        *      n   0   0  ... 0   0   0
        */
package by.epam_tc.step1.t2.type2;

import java.util.Scanner;

public class Task5 {
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i <  matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 8;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
                if (i + j >= n) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("полученная матрица:");
        showMatrix(matrix);
    }
}
