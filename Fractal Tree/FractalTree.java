import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.geom.Line2D;
/**
 * Write a description of class FractalTreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTree extends JFrame
{
    double currentAngle =0;
    public FractalTree() {
        super("Fractal Tree");
        setBounds(100, 100, 800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void drawFractal(Graphics2D g2, double x, double y, double length, double angle)
    {
        double fractalAng=Math.toRadians(angle);
        double findAdj= Math.cos(fractalAng)*length;
        double findOpp = Math.sin(fractalAng)*length;
        Line2D.Double fractalLine = new Line2D.Double(x,y,findOpp-x,y+findAdj); 
        g2.draw(fractalLine);
        drawFractal(g2,x2,y2,length-.5, currentAngle+angle);
        drawFractal(g2,x2,y2,length-.5,currentAngle-angle);
    }
    public void paint(Graphics2D g) {
        Graphics2D= (Graphics2D) g2;
         
        g.setColor(Color.BLACK);
        drawFractal(g, 400, 500, -90, 9);
    }
 
    public static void main(String[] args) {
        new FractalTree().setVisible(true);
    }
}
