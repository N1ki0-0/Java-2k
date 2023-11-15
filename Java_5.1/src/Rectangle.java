import java.lang.*;
public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    public Rectangle(String colour, boolean filled, double width, double length)
    {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
