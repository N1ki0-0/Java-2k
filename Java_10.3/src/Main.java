/*Дано натуральное число n>1. Выведите все простые множители этого
числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
сложность O(logn) */

public class Main {
    public static void main(String[] args) {
        int n = 17;
        System.out.print("Простые множители числа " + n + ": ");
        primeFactors(n, 2);
    }

    public static void primeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }
}
