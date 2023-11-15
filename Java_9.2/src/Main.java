// Пример использования интерфейса Priceable
public class Main {
    public static void main(String[] args) {
        Priceable car = new Car(25000.0);
        Priceable product = new Product(49.99);

        System.out.println("Цена машины: $" + car.getPrice());
        System.out.println("Цена товара: $" + product.getPrice());
    }
}
