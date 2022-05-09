import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicFileReader
{

    public static Path filePath;
    public static Path filePath2;

    public static BufferedReader in;
    public static BufferedWriter out;


    public static void parseFile()
    {
       try{ 
           
        in = Files.newBufferedReader(filePath); // FileReader... File should Exist
        out = Files.newBufferedWriter(filePath2); // Creates a new file if file name is given in FilePath

        {
            out.write("Hello WOrld FileWriter \n"); // writes to the Buffer not the file
            out.write("Hello WOrld FileWriter | this is the second line  \n");
            out.write("Success is a function of persistence along with other parameters");


            out.flush(); // Writes the Buffer to the File
        }

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

        Path p2 = Paths.get("data\\"+"data1.csv");
        filePath2 = p2.toAbsolutePath();  
        //can be checked on console to be as intended
        System.out.println("Reading File at Location "+filePath.toString());
        
        // code after this ***
        System.out.println("*****************************");
        System.out.println("");

        parseFile();


    }


}