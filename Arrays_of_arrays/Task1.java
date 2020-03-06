// 11. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void showRows(int[][] matrix, int colPos) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][colPos] + "  ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int cols = 10;
        int rows = 7;
        int[][] matrix = new int[cols][rows];

        Random random = new Random();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Получившеяся матрица:");
        showMatrix(matrix);

        System.out.println("Все столбцы нечётные  матрицы, у которых первый элемент больше последнего:");
        for (int j = 0; j < rows; j += 2) {
            if (matrix[0][j] > matrix[cols - 1][j]) {
                showRows(matrix, j);
            }
        }
    }
}

