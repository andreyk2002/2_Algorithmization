package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Scanner;

import static by.epam_tc.step1.t2.type3.SelectionSort.fillArray;

public class ShellSort {
    public static void main(String[] args) {
        int size = 21;
        int[] arr = new int[size];
        fillArray(arr);

        System.out.println("До сортировки - " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("После сортировки - " + Arrays.toString(arr));

    }

    public static void shellSort(int[] arr) {
        int i = 0;

        int len;
        len = arr.length;

        while (i < len - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if (i > 0) {
                    i--;
                }

            }
        }
    }
}
