// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
package by.epam_tc.step1.t2.type1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int size;
        int[] arr;

        size = 8;
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i * (i % 5);
        }
        int k;
        int sum;

        k = 3;
        sum = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов массива, кратных " +
                "заданному числу  k =" + sum);

    }

}
