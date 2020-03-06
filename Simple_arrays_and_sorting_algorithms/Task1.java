/*      Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
        дополнительный массив.
*/
package by.epam_tc.step1.t2.type3;


import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int sizeFirst = 11;
        int[] arr = new int[sizeFirst];


        Random rn = new Random();
        for (int i = 0; i < sizeFirst; i++) {
            arr[i] = rn.nextInt(40);
        }
        System.out.println("Первый массив: " + Arrays.toString(arr));
        int sizeSecond = 14;
        int[] secondArr = new int[sizeSecond];



        for (int i = 0; i < sizeSecond; i++) {
            secondArr[i] = rn.nextInt(40);
        }
        System.out.println("Второй массив: " + Arrays.toString(secondArr));

        int k = 5;

        int[] sumArr;
        sumArr = new int[sizeFirst + sizeSecond];


        int counter = 0;
        for (int i = 0; i < sizeFirst; i++, counter++) {
            sumArr[counter] = arr[i];
            if (i == k) {
                counter++;
                for (int j = 0; j < sizeSecond; j++, counter++) {
                    sumArr[counter] = secondArr[j];
                }
                counter--;
            }
        }
        System.out.println("Результат объединения массивов: " + Arrays.toString(sumArr));

    }
}
