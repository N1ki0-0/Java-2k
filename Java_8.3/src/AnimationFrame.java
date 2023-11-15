import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationFrame extends JFrame {
    private int currentFrame = 0;
    private Timer timer;
    private ImageIcon[] frames;
    private JLabel animationLabel;

    public AnimationFrame() {
        setTitle("Animation");
        setSize(700, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frames = new ImageIcon[5]; // Здесь 5 - количество кадров в анимации

        for (int i = 0; i < 5; i++) {
            frames[i] = new ImageIcon("images/frame" + i + ".jpg"); // путь к изображениям
        }

        animationLabel = new JLabel(frames[currentFrame]);
        add(animationLabel);

        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % 5;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationFrame frame = new AnimationFrame();
            frame.setVisible(true);
        });
    }
}
