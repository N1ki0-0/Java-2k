/*Дано натуральное число N. Вычислите сумму его цифр. При решении
этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
разумеется). */


public class Main {
    public static void main(String[] args) {
        int n = 124;
        int sum = sumOfDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            return lastDigit + sumOfDigits(remainingDigits);
        }
    }
}
