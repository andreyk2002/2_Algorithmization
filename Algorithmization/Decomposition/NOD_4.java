/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */
package by.epam_tc.step1.t2.type4;

import java.util.Scanner;

import static by.epam_tc.step1.t2.type4.NOK_NOD.gcd;

public class NOD_4 {
    public static int gcdFour(int a, int b, int c, int d) {
        int ab = gcd(a, b);
        int cd = gcd(c, d);

        if (cd == 0) {
            return ab;
        } else {
            return gcd(cd, ab % cd);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите четыре натуральных числа ");
        System.out.print("A=");
        int firstNumber = in.nextInt();
        System.out.print("B=");
        int secondNumber = in.nextInt();
        System.out.print("С=");
        int thirdNumber = in.nextInt();
        System.out.print("B=");
        int fourthNumber = in.nextInt();

        int gcdF = gcdFour(firstNumber, secondNumber, thirdNumber, fourthNumber);
        System.out.println("НОД(А,В,C,D)=" + gcdF);

        in.close();

    }
}
