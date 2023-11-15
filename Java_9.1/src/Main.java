// Пример использования интерфейса Nameable
public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable animal = new Animal("Собака");

        System.out.println("Планета: " + planet.getName());
        System.out.println("Животное: " + animal.getName());
    }
}
