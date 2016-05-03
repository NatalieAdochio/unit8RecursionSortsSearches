import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTree implements ActionListener {
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;

    private FractalPanel drawing;
    private JPanel panel;
    private JFrame frame;
    
    public static void main(String[] args) {
        FractalTree viewer = new FractalTree();
    }
    
    public FractalTree () {
        drawing = new FractalPanel();

        panel = new JPanel();
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent event)
    {
        frame.repaint();
    }
}