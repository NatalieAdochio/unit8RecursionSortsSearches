import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class wordCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordCount
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class wordCount
     */
    public WordCount()
    {
        // initialise instance variables

    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        // put your code here
        int wordCount = 0;
        int lineCount = 1;
        int characount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please put in file name");
        File inputFile = new File(input.next());
        try
        {
            Scanner in = new Scanner(inputFile);
            //in.useDelimiter(" ");
            while (in.hasNext())
            {
                wordCount++;
                in.next();
            }
            System.out.println("The Wordcount is "+wordCount);
            Scanner line = new Scanner(inputFile);
            while (in.hasNextLine())
            {
                lineCount++;
                line.next();
            }
            System.out.println("The Line count is "+lineCount);
            Scanner chara = new Scanner(inputFile);
            chara.useDelimiter("");
            while(chara.hasNext())
            {
                characount++;
                char ch = chara.next().charAt(0);
            }
            System.out.println("The char count is "+characount);
        }
        catch(FileNotFoundException ae)
        {
            System.out.print("Is not real");
        }
    }
}
