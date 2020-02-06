//найти второй по величине элемент массива
package by.epam_tc.step1.t2.type4;

public class Task5 {
    public static int getSecond(int[] arr) {
        int max = Math.max(arr[0], arr[1]);
        int preMax = Math.min(arr[0], arr[1]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                preMax = max;
                max = arr[i];
            }
        }
        return preMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 11, 13, 14, 19, 22, 134};

        System.out.print("Второй по величине элемент = " + getSecond(arr));
    }
}
