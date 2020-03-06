// найти положительные диагональные (главной диагонали)
// элементы матрицы
package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void fillMatrix(int[][] matrix) {
        if(matrix == null){
            return;
        }
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(200) - 100;
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n;
        n = 10;

        int[][] matrix;
        matrix = new int[n][n];
        fillMatrix(matrix);

        System.out.println("Получившеяся матрица:");
        showMatrix(matrix);

        System.out.println("положительные диагональные элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
