import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {
    public DisplayImage(String imagePath) {
        setTitle("Image Viewer");
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);

            getContentPane().add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DisplayImage frame = new DisplayImage("images/MIREA_Gerb_Colour.jpg");
            frame.setVisible(true);
        });
    }
}
