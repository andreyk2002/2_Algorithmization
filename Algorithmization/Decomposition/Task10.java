//дано натуральное число n, написать методы формирования
//массива, элементы которого являются цифры числа n
package by.epam_tc.step1.t2.type4;

import java.util.Arrays;

public class Task10 {
    public static int[] makeArray(int numb) {

        int size = countDigits(numb);
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = numb % 10;
            numb /= 10;
        }
        return arr;
    }

    public static int countDigits(int numb) {
        int size = 1;

        while (numb >= 10) {
            size++;
            numb /= 10;
        }
        return size;
    }

    public static void main(String[] args) {

        System.out.println("Массив, состоящий из цифр числа 216548746");
        int[] arr = makeArray(216548746);
        System.out.println(Arrays.toString(arr));
    }
}
