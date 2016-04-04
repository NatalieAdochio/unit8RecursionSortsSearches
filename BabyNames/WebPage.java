import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.io.FileNotFound;
/**
 * Write a description of class WebPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WebPage
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class WebPage
     */
    public WebPage()
    {
        // initialise instance variables

    }

    public static void main(String[] args)
    {
        // put your code here
        String address = "http://horstmann.com/index.html";
        try{
            URL pageLocation = new URL(address);
            Scanner in = new Scanner(pageLocation.openStream());
        }
        catch(FileNotFound Exception)
        {System.out.println("not a file");
        }

    }
}