import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new ShapesPanel());
    }

    private class ShapesPanel extends JPanel {
        private final int NUM_SHAPES = 20;
        private Shape[] shapes;

        public ShapesPanel() {
            shapes = new Shape[NUM_SHAPES];
            Random rand = new Random();

            for (int i = 0; i < NUM_SHAPES; i++) {
                int x = rand.nextInt(WIDTH);
                int y = rand.nextInt(HEIGHT);
                int widthOrRadius = rand.nextInt(50) + 20;
                int height = rand.nextInt(50) + 20;
                Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

                if (rand.nextBoolean()) {
                    shapes[i] = new Circle(color, x, y, widthOrRadius);
                } else {
                    shapes[i] = new Rectangle(color, x, y, widthOrRadius, height);
                }
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapes frame = new RandomShapes();
            frame.setVisible(true);
        });
    }
}
