import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicFileReader
{

    public static Path filePath;
    public static BufferedReader in;


    public static void parseFile()
    {
       try{ 
           
        in = Files.newBufferedReader(filePath);

        String line;
        boolean firstLineFlag=true;

        while((line=in.readLine())!=null)
        {

            if(firstLineFlag==false)
            {
                firstLineFlag = true; // this is to ignore the first line of file which is ReadMe
            }
            else
            {
                System.out.println(line);
            }

        }

         }
         catch(IOException ex){

            System.out.println("Invalid File, Please enter another path");
            System.exit(-1);  
         }


    }

    public static void main(String[] args)  
    {

        System.out.println("This is the Basic File Reader");
        System.out.println("*****************************");
        System.out.println("");

        Path p1 = Paths.get("data\\"+args[0]);
        filePath = p1.toAbsolutePath();  
        //can be checked on console to be as intended
        System.out.println("Reading File at Location "+filePath.toString());
        
        // code after this ***
        System.out.println("*****************************");
        System.out.println("");

        parseFile();


    }


}