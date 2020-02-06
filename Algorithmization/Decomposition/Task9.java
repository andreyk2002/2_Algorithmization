// Написать методы вычисления площади четырехугольникф
// (x, y, z, t - стороны) если угол между сторонами X и Y прямой
package by.epam_tc.step1.t2.type4;

public class Task9 {
    public static double findCos(double a, double b, double c) {
        double cos;
        cos = (a * a + b * b - c * c) / (2 * a * b);
        return cos;
    }

    public static double getSquare(double x, double y, double z, double t) {
        double firstDiag;
        firstDiag = Math.sqrt(x * x + y * y);
        double firstS;
        firstS = (x * y) / 2;
        double cosZT;
        cosZT = findCos(z, t, firstDiag);
        double sinZT;
        sinZT = Math.sqrt(1 - cosZT * cosZT);
        double secondS = z * t * sinZT / 2;

        return firstS + secondS;

    }

    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = 6;
        double t = 4.5;

        System.out.println("Площадь четырёхугольника равна: " +
                getSquare(x, y, z, t));
    }
}
