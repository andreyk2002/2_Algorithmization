/*      В числовой матрице поменять местами два столбца любых столбца,
        т. е. все элементы одного столбца поставить на соответствующие
        им позиции другого, а его элементы второго переместить в первый.
        Номера столбцов вводит пользователь с клавиатуры.
 */
package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    private int rows;

    public static void fillMatrix(int[][] matrix) {
        if(matrix == null){
            return;
        }
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

        int cols = 9;
        int rows = 4;
        int[][] matrix = new int[cols][rows];

        fillMatrix(matrix);


        System.out.println("Исходная матрица:");
        showMatrix(matrix);


        int changeCol1 = 1;

        if (changeCol1 > cols || changeCol1 < 0) {
            System.out.println("Ой, похоже кто-то накосячил");
            System.exit(1);
        }

        int changeCol2 = 3;
        if (changeCol2 > cols || changeCol2 < 0) {
            System.out.println("Ой, похоже кто-то накосячил");
            System.exit(1);
        }
        int[] tempArr = new int[cols];
        for (int i = 0; i < cols; i++) {
            tempArr[i] = matrix[i][changeCol1 - 1];
        }
        for (int i = 0; i < cols; i++) {
            matrix[i][changeCol1 - 1] = matrix[i][changeCol2 - 1];
        }
        for (int i = 0; i < cols; i++) {
            matrix[i][changeCol2 - 1] = tempArr[i];
        }
        System.out.println("После перестановки:");
        showMatrix(matrix);
    }
}
