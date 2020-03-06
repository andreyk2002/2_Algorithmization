// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

package by.epam_tc.step1.t2.type2;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int cols;
        int rows;

        cols = 9;
        rows = 9;
        int[][] matrix = new int[cols][rows];
        fillMatrix(matrix);

        System.out.println("Первоначальная матрица");
        showMatrix(matrix);
        int[][] transportedMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transportedMatrix[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < rows; i++) {
            quickSort(transportedMatrix[i], 0, cols - 1);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = transportedMatrix[i][j];
            }
        }
        System.out.println("Матрица, отсортированная по возрастанию элементов столбцов ");
        showMatrix(matrix);

    }

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

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int divideIndex = partition(arr, begin, end);

            quickSort(arr, begin, divideIndex - 1);
            quickSort(arr, divideIndex, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int rightIndex = end;
        int leftIndex = begin;

        int pivot = arr[(begin + end) / 2];
        while (leftIndex <= rightIndex) {
            //>
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            //<
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
