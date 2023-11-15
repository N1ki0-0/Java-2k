public class ex2 {
        public static void main(String[] args) {
            // в цикле for перебираем все аргументы командной строки
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
