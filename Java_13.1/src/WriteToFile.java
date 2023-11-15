import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/example.txt"));
            writer.write(text);
            writer.close();

            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
