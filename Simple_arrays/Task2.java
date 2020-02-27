//    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//    числом. Подсчитать количество замен.
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int size;
        ;
        double[] arr;

        size = 11;
        arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        double z;
        z = 4 ;

        int numbOfChanges = 0;
        System.out.println("До замены:\n" + Arrays.toString(arr));

        for (int i = 0; i < size; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                numbOfChanges++;
            }
        }
        System.out.println("После замены:\n" + Arrays.toString(arr));
        System.out.println("Количество замен =" + numbOfChanges);

    }
}
