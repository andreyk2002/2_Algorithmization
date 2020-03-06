package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int size = 40;
        int[] arr = new int[size];
        fillArray(arr);

        System.out.println("До сортировки - " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("После сортировки - " + Arrays.toString(arr));

    }

    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void selectionSort(int[] arr) {
        int len;
        len = arr.length;
        int i = 0;
        int maxIndex = 0;
        while (i < len) {
            for (int j = i; j < len; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }

            }
            int tmp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = tmp;
            i++;
            maxIndex = i;
        }
    }
}
