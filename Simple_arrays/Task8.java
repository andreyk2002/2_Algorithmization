/*
        Rus 8. Дана последовательность целых чисел a 1 , a 2 ,... a n . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min( a 1 , a 2 , ... a n ) .

 */
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void fillArr(int [] arr){
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(50);
        }
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[16];

        fillArr(arr);

        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        int min = arr[0];
        for (var el : arr) {
            if (el < min) {
                min = el;
            }
        }
        int howMany = 0;

        for (var el : arr) {
            if (el == min) {
                howMany++;
            }
        }
        int[] resultArr;
        resultArr = new int[arr.length - howMany];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                resultArr[counter] = arr[i];
                counter++;
            }
        }
        System.out.println("Новый массив:\n" + Arrays.toString(resultArr));
    }
}
