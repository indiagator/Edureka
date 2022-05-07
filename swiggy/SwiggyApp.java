import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**Basic Java App Boiler Plate Code */
public class SwiggyApp
{

    public static Path filePath; //*newCode
    public static BufferedReader in_customer; //*newCode

    public static void parseFile()
    {
       try{ 
           
        in_customer = Files.newBufferedReader(filePath);

        String line;
        boolean firstLineFlag=true;

        while((line=in_customer.readLine())!=null)
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


    public static void checkBodyTemp()
    {

        double delGuyBodTemp = 98.6; // Delivery Guy's Body Temperature being declared and initialized
        System.out.println("Normal Value of the Delivery Guy's Body Temperature is : "+delGuyBodTemp + " degree fa");

        double[] delGuyBodTempWeek = {98.4,98.3,99.6,98.8,99.6,98.4,98.6}; // del guy's body tem data for a week

        boolean isDelGuyFit = true; //1 bit

        

        for(int looper = 0;looper<7;looper++)
        {

                String day = "invalid day";

            switch (looper)
            {
            case 0:  day = "Monday";
                     break;   
            case 1:  day = "Tuesday";
                     break;
            case 2:  day = "Wednesday";
                     break;
            case 3:  day = "Thursday";
                     break;
            case 4:  day = "Friday";
                     break;
            case 5:  day = "Saturday";
                     break;
            case 6:  day = "Sunday";
                     break;                    
            default: day = "Invalid Day";
                     break;
            }

            if(delGuyBodTempWeek[looper]  > 98.5) // body temperature on wednesday, threshold 96.4 - 98.5
            
                {
                    System.out.println("Del guy was not fit on "+day);
                }
                else if(delGuyBodTempWeek[looper]  < 96.4)
                {
                    System.out.println("Del guy was not fit on "+day);
                }
                else
                {
                    System.out.println("Del guy was fit on "+day);
                }


        }

        /*
        while(looper < 7)
        {

            //System.out.println("value of looper is "+looper);
           // System.out.println("value of body temp of del guy on "+(looper+1)+"st day is "+delGuyBodTempWeek[looper]);


           String day = "invalid day";

        switch (looper) {
            case 0:  day = "Monday";
                     break;   
            case 1:  day = "Tuesday";
                     break;
            case 2:  day = "Wednesday";
                     break;
            case 3:  day = "Thursday";
                     break;
            case 4:  day = "Friday";
                     break;
            case 5:  day = "Saturday";
                     break;
            case 6:  day = "Sunday";
                     break;                    
            default: day = "Invalid Day";
                     break;
        }

            if(delGuyBodTempWeek[looper]  > 98.5) // body temperature on wednesday, threshold 96.4 - 98.5
            
                {
                    System.out.println("Del guy was not fit on "+day);
                }
                else if(delGuyBodTempWeek[looper]  < 96.4)
                {
                    System.out.println("Del guy was not fit on "+day);
                }
                else
                {
                    System.out.println("Del guy was fit on "+day);
                }

            looper++;
        }

        */
        

        /** 

        int month = 1; //August

        String monthString = "April";

        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }

        System.out.println(monthString);

        */

        /*

        if(delGuyBodTempWeek[2]  > 98.5) // body temperature on wednesday, threshold 96.4 - 98.5
        {
            System.out.println("Del guy was not fit on wednesday ");
        }
        else if(delGuyBodTempWeek[2]  < 96.4)
        {
            System.out.println("Del guy was not fit on wednesday ");
        }
        else
        {
            System.out.println("Del guy was fit on wednesday ");
        }

         */

        /*

        System.out.println( delGuyBodTempWeek[0] );
        System.out.println( delGuyBodTempWeek[1] );
        System.out.println( delGuyBodTempWeek[2] );
        System.out.println( delGuyBodTempWeek[3] );
        System.out.println( delGuyBodTempWeek[4] );
        System.out.println( delGuyBodTempWeek[5] );
        System.out.println( delGuyBodTempWeek[6] );

         

         double a = 5;
         double b = 10;

         //System.out.println(a++); //increments or decrements the value of an integer by 1
         //System.out.println(a);

         System.out.println(a/b);

         */


    }

    public static void main(String[] args)
    {

        /* Reading the File System - Begins  */

        System.out.println("This is the Basic File Reader");
        System.out.println("*****************************");
        System.out.println("");

        Path p1 = Paths.get("data\\"+"customer.csv");
        filePath = p1.toAbsolutePath();  
        //can be checked on console to be as intended
        System.out.println("Reading File at Location "+filePath.toString());
        
        // code after this ***
        System.out.println("*****************************");
        System.out.println("");

        parseFile();

        /* Reading the File System - Ends  */


        System.out.println("********************");
        System.out.println("");


        Customer myself = new Customer("Suresh Athiraj","9935237896");
        System.out.println("Welcome to Swiggy "+myself.Get_name());
        System.out.println("Your Registered Phone Number is "+myself.Get_phoneNumber());
        System.out.println(myself.poke());

        System.out.println("");
        System.out.println("********************");
        
        DeliveryGuy firstDelGuy = new DeliveryGuy("001","black_pulsar");

        System.out.println("Name of the new Del Guy is "+firstDelGuy.Get_name());
        System.out.println("Emp Id of the new Del Guy is "+firstDelGuy.Get_emp_id());
        System.out.println("Phone Number of the new Del Guy is "+firstDelGuy.Get_phoneNumber());
        System.out.println("Vehicle Type of the new Del Guy is "+firstDelGuy.Get_vehicle());
        System.out.println(firstDelGuy.poke());




    }    
}
