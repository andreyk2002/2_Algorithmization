/*      Матрицу 10x20 заполнить случайными числами от 0 до 15.
        Вывести на экран саму матрицу и номера строк, в
        которых число 5 встречается три и более раз
        */
package by.epam_tc.step1.t2.type2;

import java.util.Random;

public class Task11 {
    public static void fillMatrix(int[][] matrix) {
        if(matrix == null){
            return;
        }
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
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
        int[][] matrix;
        matrix = new int[10][20];
        fillMatrix(matrix);

        System.out.println("Получившеяся матрица");
        showMatrix(matrix);
        int[] tripleFive;
        tripleFive = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    tripleFive[i]++;
                }
            }
        }
        System.out.print("Номера строк, где 5 встречается три и более раз - ");
        for (int i = 0; i < 10; i++) {
            if (tripleFive[i] >= 3) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
