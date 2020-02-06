package by.epam_tc.step1.t2.type4;

import java.util.Scanner;

public class HexagonSquare {
    public static double eqTriangleSquare(double a) {
        return ((a * a * Math.sqrt(3)) / 4.0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону правильного шестиугольника:");
        int hexSide = in.nextInt();

        System.out.println("Площадь шестиугольника равна " + 6 * eqTriangleSquare(hexSide));
    }
}
