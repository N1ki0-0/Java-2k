public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);  // приведение Circle к Shape
        // Возвраты методов Circle, определенных в Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());   // Не в Shape

        System.out.println();

        Circle c1 = (Circle)s1;                   // Опущен обратно в Circle
        // Возвраты методов Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        System.out.println();
        //Shape s2 = new Shape();   //  Abstract

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);
        // Возвраты методов Rectangle, определенных в Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Не в Shape

        System.out.println();

        Rectangle r1 = (Rectangle)s3;
        // Возвраты методов Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();

        Shape s4 = new Square(6.6);
        // Возвраты методов Square, определенных в Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());  // не в Rectangle

        System.out.println();
        Rectangle r2 = (Rectangle)s4;
        // Возвраты методов Square, определенных в Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());  // не в Rectangle
        System.out.println(r2.getLength());

        System.out.println();

        // Преобразование прямоугольника r2 вниз в Square
        Square sq1 = (Square)r2;
        // Возвраты методов Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
