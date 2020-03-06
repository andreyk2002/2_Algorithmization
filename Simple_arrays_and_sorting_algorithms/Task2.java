/*  Даны две последовательности a1<=a2<=a3<=aN и b1<=b2<=b3<=bM. Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
*/
package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sizeFirst = 11;
        int[] arr = new int[sizeFirst];

        Random rn = new Random();
        for (int i = 0; i < sizeFirst; i++) {
            arr[i] = rn.nextInt(40);
        }
        selectionSort(arr);

        int sizeSecond = 14;
        int[] secondArr = new int[sizeSecond];

        for (int i = 0; i < sizeSecond; i++) {
            secondArr[i] = rn.nextInt(40);
        }
        selectionSort(secondArr);
        int[] sumArr = new int[sizeFirst + sizeSecond];


        int counter1 = 0;
        int counter2 = 0;
        boolean inBounds1 = true;
        boolean inBounds2 = true;
        for (int i = 0; i < sumArr.length; i++) {
            if (inBounds1 && (!inBounds2 || arr[counter1] < secondArr[counter2])) {
                sumArr[i] = arr[counter1];
                counter1++;
                if (counter1 >= sizeFirst) {
                    inBounds1 = false;
                }
            } else {
                sumArr[i] = secondArr[counter2];
                counter2++;
                if (counter2 >= sizeSecond) {
                    inBounds2 = false;
                }
            }
        }
        System.out.println("Неубывающая последовательность состоящая из всех элементов обоих массивов: "
                + Arrays.toString(sumArr));

    }
    public static void selectionSort(int [] arr) {
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
            
            int tmp;
            tmp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = tmp;
            i++;
            maxIndex = i;
        }
    }
}
