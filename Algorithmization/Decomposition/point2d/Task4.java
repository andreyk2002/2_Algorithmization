package by.epam_tc.step1.t2.type4.point2d;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static double dist(Point2D a, Point2D b) {
        double tmpDst = Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2);
        double dist = Math.sqrt(tmpDst);

        return dist;
    }

    public static void showMaxPair(Point2D[] arr) {
        double maxDist = dist(arr[0], arr[1]);

        int iMax = 0;
        int jMax = 1;
        double dst;
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                dst = dist(arr[i], arr[j]);
                if (dst > maxDist) {
                    maxDist = dst;
                    jMax = j;
                    iMax = i;
                }
            }
        }
        System.out.println("Наибольшее расстояние - между " + iMax + "-ой и " + jMax + "-ой вершиной");

    }

    public static void main(String[] args) {
        Point2D[] arr = new Point2D[8];

        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            arr[i] = new Point2D(10.0 / (i + 1), 0.2 * i);
        }
        System.out.println(Arrays.toString(arr));
        showMaxPair(arr);

    }
}
