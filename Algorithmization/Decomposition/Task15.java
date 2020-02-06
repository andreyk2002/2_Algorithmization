/*      Найти все натуральные n-значные числа, цифры в которых образуют строго
        возрастающую последовательность (например, 1234, 5789). Для решения задачи
        использовать декомпозицию.
        */
package by.epam_tc.step1.t2.type4;

public class Task15 {
    public static int fasterThanPow(int numb, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= numb;
        }
        return res;
    }

    public static boolean isIncreasing(int numb) {

        while (numb > 0) {
            int currentEnd = numb % 10;
            int currentPreEnd = (numb % 100) / 10;

            if (currentPreEnd >= currentEnd) {
                return false;
            }
            numb /= 10;
        }
        return true;
    }

    public static void showIncreasing(int n) {
        int first = fasterThanPow(10, n - 1);

        for (int i = first; i < first * 10; i++) {
            if (isIncreasing(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Все строго возрастающие " + n + "-значные числа");
        showIncreasing(n);
    }

}
