// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.
package by.epam_tc.step1.t2.type1;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void fillArr(double [] arr){
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt()/(rn.nextInt() * 1.0);
        }
    }

    public static boolean isSimple(int a) {
        if (a == 2) {
            return true;
        }
        if (a % 2 == 0 || a == 1) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int size;
        double[] arr;

        size = 12;
        arr = new double[size];

        fillArr(arr);

        double sumSimples = 0;
        for (int i = 0; i < size; i++) {
            if (isSimple(i + 1)) {
                sumSimples += arr[i];
            }
        }
        System.out.println("Сумма элементов, порядковые номера которых являются простыми числами равна " +
                sumSimples);
    }
}
