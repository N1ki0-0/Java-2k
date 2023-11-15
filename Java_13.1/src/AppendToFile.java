import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для добавления в файл: ");
            String newText = scanner.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/example.txt", true));
            writer.newLine();  // Добавляем новую строку перед новым текстом
            writer.write(newText);
            writer.close();

            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
