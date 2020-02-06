//написать методы, определяющие в каком из данных двух чисел
//больше цифр
package by.epam_tc.step1.t2.type4;

public class Task11 {
    public static int countDigits(int numb) {
        int size = 1;

        while (numb >= 10) {
            size++;
            numb /= 10;
        }
        return size;
    }

    public static void showBiggerDigits(int x, int y) {
        int dig1;
        dig1 = countDigits(x);
        int dig2 = countDigits(y);
        if (dig1 == dig2) {
            System.out.println("У данных чисел одинаковое кол-во цифр");
            ;
        } else {
            System.out.print("Больше цифр у числа ");
            if (dig1 > dig2) {
                System.out.print(x);
            } else {
                System.out.print(y);
            }
        }
    }

    public static void main(String[] args) {
        int x = 12340;
        int y = 123400;

        showBiggerDigits(x, y);
    }
}
