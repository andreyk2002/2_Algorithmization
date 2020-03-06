//  Дана матрица. Вывести k-ю строку и p-й столбец матрицы
package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
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

        cols = 5;
        rows = 6;
        int[][] matrix = new int[cols][rows];
        fillMatrix(matrix);


        int row = 4;
        /*if (row > rows || row < 0) {
            System.out.println("Ой, похоже кто-то накосячил");
            System.exit(1);
        }*/

        int col = 2;
        /*if (col > cols || col < 0) {
            System.out.println("Ой, похоже кто-то накосячил");
            System.exit(1);
        }*/
        System.out.println("Вся матрица");
        showMatrix(matrix);
        System.out.println(col + "-ая строка:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[col - 1][i] + " ");
        }

        System.out.println("\n" + row + "-ий столбец");

        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[i][row - 1] + " ");
        }
    }
}
