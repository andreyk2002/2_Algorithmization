/* таск решался по определению из Википедии
(сумма цифр, возведённых в степень, равную количеству его цифр равна самому числу) */

package by.epam_tc.step1.t2.type4;

public class Armstrong {

    public static int fasterThanPow(int numb, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= numb;
        }
        return res;
    }

    public static int numberOfDigits(int numb) {
        int res = 1;
        while (numb > 10) {
            numb /= 10;
            res++;
        }
        return res;
    }

    public static boolean isArmstrong(int numb) {
        int result = 0;
        int numbOfDigits = numberOfDigits(numb);

        result = sumOfDegrees(numbOfDigits, numb);

        return result == numb;
    }

    public static int sumOfDegrees(int n, int numb) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int tmp;
            tmp = numb % 10;
            result += fasterThanPow(tmp, n);
            numb /= 10;
        }
        return result;
    }

    public static void showArmNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        int last = 93000;
        System.out.println("Все числа Армстронга до " + last);
        showArmNumbers(last);
    }
}
