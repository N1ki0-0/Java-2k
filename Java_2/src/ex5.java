public class ex5 {
    // метод для вычисления факториала числа
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // проверка работы метода
        int number = 5;
        int factorialResult = factorial(number);
        System.out.println("Факториал числа " + number + ": " + factorialResult);
    }
}
