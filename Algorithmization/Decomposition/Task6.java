//написать методы, проверяющие, являются ли три заданные числа
// взаимно простыми
package by.epam_tc.step1.t2.type4;

public class Task6 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static boolean isSimple(int a, int b, int c) {
        if (gcd(a, b) + gcd(b, c) + gcd(a, c) != 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int firstDig = 90;
        int secDig = 17;
        int thirdDig = 11;

        System.out.println("Данные три числа взаимно просты: " + isSimple(firstDig, secDig, thirdDig));

    }
}
