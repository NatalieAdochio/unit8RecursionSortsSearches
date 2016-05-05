import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
import javax.swing.JPanel;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Color inputOfUser;
      private final double BASE_X = 450, BASE_Y = 700, TIP_Y = 450;
   
   private final double initialAngle_Radians = 0;
   
   private final double initialLength = BASE_Y - TIP_Y;
   
   private final double angleOfChange_Radians_CW = Math.PI/4.0;
   private final double angleOfChange_Radians_CCW = Math.PI/4.0;
   
   private final double rateOfChange = 1.5;
   
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent() {

    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
 
    public void paintComponent(Graphics g)
    {
        
        
        Graphics2D g2 = (Graphics2D) g;
        //g2.fill(inputOfUser);
        this.setOpaque(true);
        this.setBackground(inputOfUser);
        super.paintComponent(g);
       
       
        FractalTree tree = new FractalTree();
        
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame(Graphics2D g2)
    {
        // update the objects in the cityscape so they are animated
        // ...
         
        FractalPanel tree = new FractalPanel();
       tree.drawFractal(BASE_X+2, BASE_Y+2, BASE_X+2, TIP_Y+2, g2, initialAngle_Radians+3, initialLength+3);
    
       
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
