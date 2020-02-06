/*  Два простых числа называются «близнецами», если они отличаются друг от друга
    на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
    n,2n], где n - заданное натуральное число больше 2. Для решения задачи
    использовать декомпозицию.
 */
package by.epam_tc.step1.t2.type4;

public class Task13 {
    public static void fillArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = n + i;
        }
    }

    public static void toSimple(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (!isSimple(arr[i])) {
                    int j = i;
                    int tmp = arr[i];
                    while (j < arr.length) {
                        arr[j] = 0;
                        j += tmp;
                    }

                }
            }
        }
    }

    public static boolean isSimple(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showSiblings(int[] simpleArr) {
        for (int i = 0; i < simpleArr.length - 2; i++) {
            if ((simpleArr[i] != 0) && (simpleArr[i + 2] != 0)) {
                System.out.println(simpleArr[i] + " " + simpleArr[i + 2]);
            }
        }

    }

    public static void main(String[] args) {
        int n = 123;
        int[] arr = new int[n];
        fillArray(arr);
        toSimple(arr);
        System.out.println("Все числа-близнецы от n до 2n :");
        showSiblings(arr);
    }
}
