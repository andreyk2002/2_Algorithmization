/*      Из заданного числа вычТи сумму его цифр. Из результата вновь вычТи сумму его
        цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
        Для решения задачи использовать декомпозицию
        */
package by.epam_tc.step1.t2.type4;

public class Task17 {
    public static int sumOfDigits(int numb) {
        int sum = 0;
        while (numb > 10) {
            int tmp;
            tmp = numb % 10;
            numb /= 10;
            sum += tmp;
        }
        sum += numb;
        return sum;
    }

    public static int numberOfTimes(int numb) {
        int res = 0;
        while (numb != 0) {
            int sumNumb = sumOfDigits(numb);
            numb -= sumNumb;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {

        int numb = 449;
        System.out.println("Для того чтобы число превратилось в 0 " +
                "нужно " + numberOfTimes(numb) + " действий");
    }
}
