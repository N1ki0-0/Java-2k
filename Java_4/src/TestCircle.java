public class TestCircle
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        circle.setRadius(7.0);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
    }
}
