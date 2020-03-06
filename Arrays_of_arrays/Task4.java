// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное);
package by.epam_tc.step1.t2.type2;

import java.util.Scanner;

public class Task4 {
    public static void showMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int n = 12;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + 1;
            }
        }

        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = n - j;
            }
        }
        System.out.println("полученная матрица:");
        showMatrix(matrix);
    }
}
