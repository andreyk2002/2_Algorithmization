//5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
package by.epam_tc.step1.t2.type1;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void fillArr(int [] arr){
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1000);
        }
    }
    public static void main(String[] args) {
        int size;
        int[] arr;

        size = 8;
        arr = new int[size];

       fillArr(arr);

        for (int i = 0; i < size; i++) {
            if (arr[i] > i + 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
