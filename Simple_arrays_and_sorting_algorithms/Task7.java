/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */
package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int sizeFirst = 11;
        double[] arr = new double[sizeFirst];

        Random rn = new Random();
        for (int i = 0; i < sizeFirst; i++) {
            arr[i] = rn.nextInt(100) /( 1.0 * rn.nextInt(100));
        }
        selectionSort(arr);
        System.out.println("Первый массив: " + Arrays.toString(arr));

        int sizeSecond = 14;
        double[] secondArr = new double[sizeSecond];



        for (int i = 0; i < sizeSecond; i++) {
            secondArr[i] = rn.nextInt(100) / (1.0 * rn.nextInt(100));
        }

        selectionSort(secondArr);
        System.out.println("Второй массив: " + Arrays.toString(secondArr));
        int counter1 = 0;
        int counter2 = 0;
        boolean inBounds1 = true;
        boolean inBounds2 = true;

        System.out.println("Номера, куда нужно вставлять элементы второй последовательности,"
                + "чтобы первая последовательность оставалась возрастающей");

        for (int i = 0; i < sizeFirst + sizeSecond; i++) {
            if (inBounds1 && (!inBounds2 || arr[counter1] < secondArr[counter2])) {

                counter1++;
                if (counter1 >= sizeFirst) {
                    inBounds1 = false;
                }
            } else {
                System.out.print((i + 1) + " ");
                counter2++;
                if (counter2 >= sizeSecond) {
                    inBounds2 = false;
                }
            }
        }


    }

    public static void selectionSort(double [] arr) {
        int len;
        len = arr.length;
        int i = 0;
        int maxIndex = 0;
        while (i < len) {
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }

            }
            double tmp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = tmp;
            i++;
            maxIndex = i;
        }
    }
}
