/*      Задана матрица неотрицательных чисел.
        Посчитать сумму элементов в каждом столбце.
        Определить, какой столбец содержит максимальную сумму.
        */
package by.epam_tc.step1.t2.type2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
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
        rows = 6;
        int[][] matrix;
        matrix = new int[cols][rows];

        fillMatrix(matrix);
        int[] sumRows ;
        sumRows = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumRows[i] += matrix[j][i];
            }
        }

        System.out.println("Получившеяся матрица:");
        showMatrix(matrix);
        System.out.println("Сумма элементов матрицы по столбцам:\n" + Arrays.toString(sumRows));
        int max;
        max = sumRows[0];
        for (var el : sumRows) {
            if (el > max) {
                max = el;
            }
        }
        System.out.println("Максимальная сумма в столбце " + max);
    }
}
