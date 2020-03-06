package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static by.epam_tc.step1.t2.type3.SelectionSort.fillArray;


public class InsertionSort {
    public static void main(String[] args) {

        int size = 32;
        int[] arr = new int[size];
        fillArray(arr);

        System.out.println("До сортировки - " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("После сортировки - " + Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        int len;
        len = arr.length;
        int[] tmpArr = new int[len];

        tmpArr[0] = arr[0];
        int i = 1;
        int pos;
        while (i < len) {

            pos = binarySearch(tmpArr, arr[i], 0, i);
            insert(tmpArr, arr[i], pos);
            i++;
        }
        for (int j = 0; j < len; j++) {
            arr[j] = tmpArr[j];
        }
    }

    private static void insert(int[] arr, int val, int pos) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
    }

    public static int binarySearch(int[] arr, int val, int begin, int bound) {

        int mid;
        mid = (bound + begin) / 2;

        while (begin < bound) {

            if (val == arr[mid]) {
                return mid;
            } else if (val > arr[mid]) {
                begin = mid + 1;
                mid = (bound + begin) / 2;
            } else {
                bound = mid;
                mid = (bound + begin) / 2;
            }
        }
        return begin;

    }
}
