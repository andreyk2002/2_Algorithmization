/*  RUS 10.  Дан  целочисленный  массив  с  количеством  элементов  п.
    Сжать  массив,  выбросив  из  него  каждый  второй элемент (освободившиеся элементы заполнить нулями)
    Примечание. Дополнительный массив не использовать.

 */
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void deleting(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void fillArr(int [] arr){
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(20);
        }
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[16];

        fillArr(arr);

        System.out.println("До удаления" + Arrays.toString(arr));
        int counter;
        boolean delPrev;

        counter = 0;
        delPrev = false;

        while (counter < arr.length) {
            if (!delPrev) {
                deleting(arr, counter);
                delPrev = true;
            } else {
                counter++;
                delPrev = false;
            }
        }
        System.out.println("После удаления" + Arrays.toString(arr));
    }
}
