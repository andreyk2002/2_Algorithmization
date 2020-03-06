/*      Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
        причем в каждом столбце число единиц равно номеру столбца.
*/
package by.epam_tc.step1.t2.type2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {

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

        cols = 10;
        rows = 10;
        if (rows > cols) {
            System.out.println("При введённых данных решение задачи невозможно");
            System.exit(1);
        }
        int[][] matrix = new int[cols][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                Random random = new Random();
                int tmpIndex = random.nextInt(cols);

                while (matrix[tmpIndex][i] == 1) {
                    tmpIndex = random.nextInt(cols);

                }
                matrix[tmpIndex][i] = 1;
            }
        }
        System.out.println("Сформированная матрица");
        showMatrix(matrix);
    }
}
