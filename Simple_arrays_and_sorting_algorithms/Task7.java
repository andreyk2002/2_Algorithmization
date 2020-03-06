/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */
package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int sizeFirst = in.nextInt();
        double[] arr = new double[sizeFirst];


        System.out.print("Введите элементы первого массива:");
        for (int i = 0; i < sizeFirst; i++) {
            arr[i] = in.nextDouble();
        }
       selectionSort(arr);

        System.out.print("Введите размер второго массива:");
        int sizeSecond = in.nextInt();
        double[] secondArr = new double[sizeSecond];


        System.out.print("Введите элементы второго массива:");
        for (int i = 0; i < sizeSecond; i++) {
            secondArr[i] = in.nextDouble();
        }
       selectionSort(secondArr);

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
                if (arr[j] > arr[maxIndex]) {
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
