// Пример класса, реализующего интерфейс Nameable (животное)
public class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
