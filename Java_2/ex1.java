public class ex1 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            // с помощью цикла for
            int sumFor = 0;
            for (int i = 0; i < array.length; i++) {
                sumFor += array[i];
            }
            System.out.println("Сумма чисел массива (for): " + sumFor);

            // с помощью цикла while
            int sumWhile = 0;
            int j = 0;
            while (j < array.length) {
                sumWhile += array[j];
                j++;
            }
            System.out.println("Сумма чисел массива (while): " + sumWhile);

            // с помощью цикла do while
            int sumDoWhile = 0;
            int k = 0;
            do {
                sumDoWhile += array[k];
                k++;
            } while (k < array.length);
            System.out.println("Сумма чисел массива (do while): " + sumDoWhile);
        }
    }
