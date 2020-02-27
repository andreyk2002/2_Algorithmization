// 4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        int size;
        double[] arr;

        size = 9;
        arr = new double[size];

        Random rn = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rn.nextInt()/(rn.nextInt() * 1.0);
        }

        System.out.println("До замены:\n" + Arrays.toString(arr));
        double max;
        double min;
        int maxIndex;
        int minIndex;

        max = arr[0];
        min = arr[0];
        maxIndex = 0;
        minIndex = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        double tmp;
        tmp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = tmp;

        System.out.println("После замены:\n" + Arrays.toString(arr));

    }

}
