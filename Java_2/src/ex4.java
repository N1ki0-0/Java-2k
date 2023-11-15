import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        // генерация массива случайных чисел
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // вывод массива на экран
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        // сортировка массива
        Arrays.sort(array);

        // вывод отсортированного массива на экран
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
