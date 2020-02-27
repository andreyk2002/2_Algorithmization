/*
       *   9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
       *   число. Если таких чисел несколько, то определить наименьшее из них.
       *

 */
package by.epam_tc.step1.t2.type1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
  public static int howManyEquals(int[] arr, int val) {
      int res = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == val) {
              res++;
          }
      }
      return res;
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

      int minAnswer;
      int numbOfEquals;

      minAnswer = arr[0];
      numbOfEquals = 1;

      for (int i = 1; i < arr.length; i++) {
          int tmp;
          tmp = howManyEquals(arr, arr[i]);
          if (tmp == numbOfEquals && arr[i] < minAnswer) {
              minAnswer = arr[i];
          }

          if (tmp > numbOfEquals) {
              minAnswer = arr[i];
              numbOfEquals = tmp;
          }
      }

      System.out.println("Исходный массив:\n" + Arrays.toString(arr));
      System.out.println("Наименьшее из наиболее часто встечающихся чисел = " + minAnswer);

  }
}
