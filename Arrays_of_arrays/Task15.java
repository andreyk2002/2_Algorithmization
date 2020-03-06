//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void fillMatrix(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int cols;
        int rows;

        cols = 7;
        rows =6;
        int[][] matrix = new int[cols][rows];
        fillMatrix(matrix);
        System.out.println("Первоначальная матрица");
        showMatrix(matrix);
        int max = matrix[0][0];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = max;
                }
            }
        }

        System.out.println("Результат:");
        showMatrix(matrix);
    }
}
