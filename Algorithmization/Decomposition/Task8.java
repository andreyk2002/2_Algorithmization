//составить методы для вычсления суммы трех последовательно расположенных
// элементов массива с номерами от k до m
package by.epam_tc.step1.t2.type4;

public class Task8 {
    public static int sumThree(int[] arr, int begin) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[begin + i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8};

        System.out.println("Суммы равны " + sumThree(arr, 1)
                + "," + sumThree(arr, 3) + "," + sumThree(arr, 4));
    }
}
