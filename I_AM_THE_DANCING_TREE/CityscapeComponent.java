import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

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
        tree.drawFractal(g2);
        
        
        tree.drawFractal(g2);
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
       
       tree.move();
       
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}