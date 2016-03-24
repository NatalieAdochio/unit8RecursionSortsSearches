import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
    public static final double LIMITGIRL = 18450257 ;
    public static final double LIMITBOY = 19229058;
    public static void main(String[] args) throws FileNotFoundException
    {  
        Scanner input = new Scanner(System.in);
        System.out.println("Please put in file name");
        File inputFile = new File(input.next());
        try
        {Scanner in = new Scanner(inputFile);

            RecordReader boys = new RecordReader(LIMITBOY);
            RecordReader girls = new RecordReader(LIMITGIRL);

            while (boys.hasMore() || girls.hasMore())
            {
                int rank = in.nextInt();

                System.out.print(rank + " ");
                boys.process(in);
                girls.process(in);
                System.out.println();

            }

            in.close();
        }
        catch(FileNotFoundException ae)
        {
            System.out.print("The file that you seek is not real");   
        }
    }   
}