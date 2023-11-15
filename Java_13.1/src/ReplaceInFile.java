import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите новую информацию: ");
            String newText = scanner.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/example.txt"));
            writer.write(newText);
            writer.close();

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

