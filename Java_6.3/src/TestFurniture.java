public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Furniture chair = new Chair("Chair", 100.0);
        Furniture sofa = new Sofa("Sofa", 500.0);

        shop.sell(chair);
        shop.sell(sofa);
    }
}
