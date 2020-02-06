/*      Написать программу, определяющую сумму n - значных чисел, содержащих только
        нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
        решения задачи использовать декомпозицию.
        */
package by.epam_tc.step1.t2.type4;

public class Task16 {

    public static boolean isOddDig(int numb) {
        while (numb > 0) {
            int tmp = numb % 10;


            if (tmp % 2 == 0) {
                return false;
            }
            numb /= 10;
        }
        return true;
    }

    public static int countEvDigits(int numb) {
        int res = 0;
        while (numb > 0) {
            int tmp = numb % 10;


            if (tmp % 2 == 0) {
                res++;
            }
            numb /= 10;
        }
        return res;
    }


    public static int sumOfOdd(int n) {
        int sum = 0;
        int first =(int)Math.pow(10, n - 1);
        for (int i = first; i < first * 10; i++) {
            if (isOddDig(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = sumOfOdd(n);
        System.out.println("Сумма " + n + "-значных чисел, содержащих только нечётные цифры = "
                + result);
        System.out.println("Количество чётных цифр в данной сумме = " + countEvDigits(result));
    }
}
