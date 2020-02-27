//Даны действительные числа а1 а2 а3 ... а2n
//найти max(a1 + a2n, a2 + a2n-1...)
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void fillArr(double[] arr) {
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt()/(rn.nextInt() * 1.0);
        }
    }

    public static void main(String[] args) {

        double[] arr;
        arr = new double[10];

        Random rn = new Random();
        fillArr(arr);
        double[] finalArr = new double[16];
        int counter = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            finalArr[counter] = arr[i] + arr[j];
            counter++;
        }
        double max = finalArr[0];
        for (int i = 1; i < arr.length / 2; i++) {
            if (max < finalArr[i]) {
                max = finalArr[i];
            }
        }
        System.out.println("max(a_1+a_2n,a2+a_2n-1,....) = " + max);

        System.out.println("Получившейся массив:\n" + Arrays.toString(arr));

    }
}
