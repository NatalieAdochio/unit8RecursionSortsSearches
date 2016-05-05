import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
import javax.swing.JPanel;

class FractalPanel extends JPanel
{    
    private final double BASE_X = 450, BASE_Y = 700, TIP_Y = 450;
   
   private final double initialAngle_Radians = 0;
   
   private final double initialLength = BASE_Y - TIP_Y;
   
   private final double angleOfChange_Radians_CW = Math.PI/4.0;
   private final double angleOfChange_Radians_CCW = Math.PI/4.0;
   
   private final double rateOfChange = 1.5;
    public FractalPanel ()
    {
      setBackground(Color.black);
      setPreferredSize(new Dimension(1000, 800));
    }
    
    public void drawFractal(double baseX, double baseY, double tipX, double tipY,
                            Graphics page, double prevAngle, double prevLength)
    {
       if (prevLength <= 1) {
         page.drawLine((int)BASE_X, (int)BASE_Y, (int)BASE_X, (int)TIP_Y);
      }
      else
      {
         // 1. Reduce segment length
         double length = prevLength/rateOfChange;
         
         // 2. Set direction equal to its parent's +/- some angle
         double newAngleCW = prevAngle + angleOfChange_Radians_CW;
         double newAngleCCW = prevAngle - angleOfChange_Radians_CCW;
         
         // 3. Draw a segment by calculating new (x, y) with trig
         double newXClockwise = tipX - (length * Math.sin(newAngleCW));
         double newYClockwise = tipY - (length * Math.cos(newAngleCW));
         page.drawLine((int)tipX, (int)tipY, (int)newXClockwise, (int)newYClockwise);
     
         double newXCounterClockwise = tipX - (length * Math.sin(newAngleCCW));
         double newYCounterClockwise = tipY - (length * Math.cos(newAngleCCW));
         page.drawLine((int)tipX, (int)tipY, (int)newXCounterClockwise, (int)newYCounterClockwise);
         drawFractal(tipX, tipY, newXClockwise, newYClockwise, page, newAngleCW, length);
         drawFractal(tipX, tipY, newXCounterClockwise, newYCounterClockwise, page, newAngleCCW, length);
        
      }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        drawFractal(BASE_X, BASE_Y, BASE_X, TIP_Y, g, initialAngle_Radians, initialLength);
        CityscapeComponent comp = new CityscapeComponent();
        Graphics2D g2 = (Graphics2D) g;
        comp.nextFrame(g2);
    }
}