/*Дано натуральное число n>1. Проверьте, является ли оно простым.
Программа должна вывести слово YES, если число простое и NO, если число
составное. Алгоритм должен иметь сложность O(logn). */

public class Main {
    public static void main(String[] args) {
        int n = 32;
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }

    public static boolean isPrimeHelper(int n, int divisor) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrimeHelper(n, divisor + 1);
    }
}
