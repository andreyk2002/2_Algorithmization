package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int size = 13;
        int[] arr = new int[size];
        fillArray(arr);

        System.out.println("До сортировки - " + Arrays.toString(arr));
        int res;
        res = bubbleSort(arr);
        System.out.println("После сортировки - " + Arrays.toString(arr));
        System.out.println("Количество перестановок = " + res);

    }

    public static void fillArray(int[] arr) {
        if(arr == null){
            return;
        }
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static int bubbleSort(int[] arr) {
        int i = 0;
        int changes = 0;
        boolean isSwapped = false;
        while (i < arr.length) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    changes++;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            i++;
            isSwapped = false;
        }
        return changes;
    }

}
