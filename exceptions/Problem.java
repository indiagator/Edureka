import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;

public class Problem
 {

    public static Path filePath;
    public static BufferedReader in;

    private int k=6;

    public void testArgValue() throws Exception 
    {
        if(k > 9)
        { 
            throw new MyException();
        }
    }

    public static void main(String[] args) throws Exception
     {
       // in = Files.newBufferedReader(filePath); // FileReader... File should Exist                       

       Problem p = new Problem();
       p.testArgValue();

           // testArgValue();
            System.out.println("You have entered "+args[0]+" as an argument");    

       
    }
    
}
