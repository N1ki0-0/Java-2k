public class TestDish
{
    public static void main(String[] args)
    {
        Dish plate = new Plate("Ceramic", 10);
        Dish cup = new Cup("Glass", 8);

        plate.use();
        cup.use();
    }
}
