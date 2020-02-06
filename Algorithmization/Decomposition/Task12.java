//даны натуральные числа n и k.Написать методы формирования массива
// А , элементы, сумма цифр которого равна kБ и которые не больше n
package by.epam_tc.step1.t2.type4;

import java.util.Arrays;

public class Task12 {
    public static int[] makeArray(int sumNumb, int maxNumb) {
        int size;
        size = countSize(sumNumb, maxNumb);
        int[] arr = new int[size];

        int i = 0;
        int element;
        element = findMaxSum(maxNumb);
        int sum;
        sum = sumOfDigits(element);
        while (sumNumb > sum) {
            sumNumb -= sumOfDigits(element);
            arr[i] = element;
            i++;
        }
        arr[i] = sumNumb;
        return arr;
    }

    public static int countSize(int sumNumb, int maxNumb) {
        int size = 0;

        while (sumNumb > 0) {
            int element;
            element = findMaxSum(maxNumb);
            sumNumb -= sumOfDigits(element);
            size++;
        }

        return size;
    }

    public static int findMaxSum(int limit) {
        int res = 0;
        int rank = 1;

        while (limit >= rank) {
            int tmp = limit / rank;
            if (tmp > 9) {
                tmp = 9;
            }
            limit -= tmp * rank;
            res += tmp * rank;
            rank *= 10;
        }
        return res;
    }

    public static int sumOfDigits(int numb) {
        int sum = 0;
        while (numb > 10) {
            int tmp;
            tmp = numb % 10;
            numb /= 10;
            sum += tmp;
        }
        sum += numb;
        return sum;
    }

    public static void main(String[] args) {
        int sumOfNumbers = 56;
        int maxNumber = 48;

        int[] arr = makeArray(sumOfNumbers, maxNumber);
        System.out.println("Получившейся массив: " + Arrays.toString(arr));
    }
}
