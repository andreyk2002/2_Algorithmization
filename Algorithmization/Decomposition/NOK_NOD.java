/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */
package by.epam_tc.step1.t2.type4;

import java.util.Scanner;

public class NOK_NOD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два натуральных числа А и В");
        System.out.print("A=");
        int firstNumber = in.nextInt();
        System.out.print("B=");
        int secondNumber = in.nextInt();

        int gcd = gcd(firstNumber, secondNumber);
        System.out.println("НОД(А,В)=" + gcd + "\tНОД(А,В)=" + (firstNumber * secondNumber) / gcd);

        in.close();

    }
}
