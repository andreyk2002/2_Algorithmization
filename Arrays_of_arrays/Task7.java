/*
 *  Сформировать квадратную матрицу порядка N по правилу:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  и подсчитать количество положительных элементов в ней.
 */
package by.epam_tc.step1.t2.type2;

import java.util.Scanner;

public class Task7 {
    public static void showMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 6;

        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin(((double) i * i - j * j) / (double) n);

            }
        }
        int howManyPositive = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    howManyPositive++;
                }
            }
        }
        System.out.println("полученная матрица:");
        showMatrix(matrix);
        System.out.println("количество положительных элементов " + howManyPositive);
    }
}
