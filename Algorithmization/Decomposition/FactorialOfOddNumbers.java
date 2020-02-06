package by.epam_tc.step1.t2.type4;

public class FactorialOfOddNumbers {
    public static int factorial(int numb) {
        int result = 1;
        for (int i = 1; i <= numb; i++) {
            result *= i;
        }
        return result;
    }

    public static int oddFactorialSum(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма факториалов нечётных чисел от 1 до 9 = " + oddFactorialSum(1, 9));
    }
}
