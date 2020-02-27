//    Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
//     положительных и нулевых элементов.
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int size;
        double[] arr;

        size = 6;
        arr = new double[size];

        Random rn = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rn.nextDouble() * 2000 - 1000;
        }

        System.out.println("Получившейся массив:\n" + Arrays.toString(arr));
        int positiveElements = 0;
        int negativeElements = 0;
        int zeroElements = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveElements++;
            } else if (arr[i] < 0) {
                negativeElements++;
            } else {
                zeroElements++;
            }
        }
        System.out.println("Количество положительных элементов =" + positiveElements);
        System.out.println("Количество отрицательных элементов =" + negativeElements);
        System.out.println("Количество нулевых элементов =" + zeroElements);
    }

}
