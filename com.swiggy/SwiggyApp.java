import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**Basic Java App Boiler Plate Code */
public class SwiggyApp
{
    private  Path fileCustomerPath; //*newCode
    private  Path fileKitchenPath; //*newCode

    //private  BufferedReader in_customer; //*newCode
    private Customer main_customer;
    private Kitchen[] kitchenList;

    public SwiggyApp()
    {
        this.kitchenList = new Kitchen[10];
    }

    public Kitchen[] getKitchenList()
    {
        return this.kitchenList;
    }

    public Customer getMain_Customer(){

        return this.main_customer;
    }

    public  void parseCustomerFile()
    {

        BufferedReader in_customer;
        String custName;
        String custPhone;
        String bodyTemp;

        String[] splitCustomerData;

       try{ 
           
        in_customer = Files.newBufferedReader(this.fileCustomerPath);

        String line;
        boolean firstLineFlag=false;

        while((line=in_customer.readLine())!=null)
        {

            if(firstLineFlag==false)
            {
                firstLineFlag = true; // this is to ignore the first line of file which is Table Schema
            }
            else
            {
               // System.out.println(line);

                splitCustomerData = line.split(",");               

                main_customer = new Customer(splitCustomerData[0], splitCustomerData[1]);
                //main_customer.setBodyTemp(Double.valueOf(splitCustomerData[2]).doubleValue());

            }

        }

         }
         catch(IOException ex){

            System.out.println("Invalid File, Please enter another path");
            System.exit(-1);  
         }


    }

    public void parseKitchenFile()
    {

        BufferedReader in_kitchen;

        try{ 
           
            in_kitchen = Files.newBufferedReader(this.fileKitchenPath);
    
            int kitchenCounter = 0;
            String line;
            boolean firstLineFlag=false;
    
            while((line=in_kitchen.readLine())!=null)
            {

                String kitchenName;        
                Location kitchenLocation;
                Dish[] menu = new Dish[10];
                Review[] kitchenReviews = new Review[10];

                String[] splitKitchenData;
    
                if(firstLineFlag==false)
                {
                    firstLineFlag = true; // this is to ignore the first line of file which is Table Schema
                }
                else
                {
                    //System.out.println(line);
                    splitKitchenData = line.split(",");

                    kitchenName = splitKitchenData[0]; // storing the name from the array into kitchenName

                    //System.out.println("");

                    //System.out.println("******Kitchen  Data Begins****** \n");

                    //System.out.println(splitKitchenData[0]);
                    //System.out.println(splitKitchenData[1]);
                   // System.out.println(splitKitchenData[2]);
                    //System.out.println(splitKitchenData[3]);

                    //System.out.println("******Kitchen  Data Ends****** \n");
                   // System.out.println("");

                    
                    String[] splitLocationData = (splitKitchenData[1]).split("\\$");
                    //System.out.println(splitLocationData[0]);
                    //System.out.println(splitLocationData[1]);

                    String x; String y;
                    x = splitLocationData[0];
                    y = splitLocationData[1];
                    int int_x;int int_y;

                    int_x = Integer.valueOf(x); //unboxing
                    int_y = Integer.valueOf(y); //unboxing

                    kitchenLocation = new Location(int_x, int_y);

                    //System.out.println(kitchenLocation.getX_lat());
                    //System.out.println(kitchenLocation.getY_long());

                    //Kitchen myKitchen = new Kitchen(kitchenName, kitchenLocation);

                    //System.out.println(myKitchen.getName());
                   // System.out.println(myKitchen.getLocation().getX_lat());

                    kitchenList[kitchenCounter] =  new Kitchen(kitchenName,kitchenLocation);


                    //System.out.println("******Kitchen  Data Begins****** \n");

                   // System.out.println(kitchenList[kitchenCounter].getName());
                   // System.out.println(kitchenList[kitchenCounter].getLocation().getX_lat());
                    //System.out.println(kitchenList[kitchenCounter].getLocation().getY_long());


                    String[] tempMenu = (splitKitchenData[2]).split("\\&");

                    /* 
                    int k=0;
                    while(tempMenu[k]!=null)
                    {
                        System.out.println(tempMenu[k]);
                        k++;

                        System.out.println("value of k is "+k);


                    }

                    */


                    /* 
                    for(String s: tempMenu)
                    {
                        System.out.println(s);
                    }

                    */
                     

                    for(int i = 0; i< tempMenu.length;i++)
                    {
                        String[] tempDish = (tempMenu[i]).split("\\$");
                        menu[i] = new Dish(tempDish[0], Integer.valueOf(tempDish[1]));
                        System.out.println(menu[i].getName()+" has a price of INR "+menu[i].getPrice());
                    }

                    kitchenList[kitchenCounter].setMenu(menu);

                    System.out.println("Kitchen Menu for "+kitchenList[kitchenCounter].getName()+"is SET!");


                    String[] tempReviews = (splitKitchenData[3]).split("\\&");

                    for(String s: tempReviews)
                    {
                        System.out.println(s);
                    }
                    

                    int tempReviewCntr = 0;

                    for(String s : tempReviews)
                    {
                        String[] temps_s = s.split("\\$");
                        kitchenReviews[tempReviewCntr] = new Review(temps_s[0], Integer.valueOf(temps_s[1]) );
                        System.out.println(kitchenReviews[tempReviewCntr].getComment()+" and a rating of "+kitchenReviews[tempReviewCntr].getRating());
                        tempReviewCntr++;

                    }
                    /*
                    try
                    {

                    for(Review r : kitchenReviews)
                    {
                        System.out.println(r.getComment()+" has a rating of "+r.getRating()+"\n");
                    }

                    }
                    catch(NullPointerException e)
                    {
                        System.out.println("Yes!! We caught the Exepction");
                    }
                    */
                   System.out.println("******Kitchen  Data Ends****** \n");


                    //Last Line of the Loop
                    kitchenCounter++;

                   // System.out.println(line);
    
                   //splitKitchenDataLineWise = line.split(",");               
    
                    //main_customer = new Customer(splitKitchenDataLineWise[0], splitKitchenDataLineWise[1]);
                    //main_customer.setBodyTemp(Double.valueOf(splitCustomerData[2]).doubleValue());
    
                }
    
            }
    
             }
             catch(IOException ex)
             {
    
                System.out.println("Invalid File, Please enter another path");
                System.exit(-1);  
             }

    }

    public  void checkBodyTemp()
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

     public void readAllData()
     {

        Path p1 = Paths.get("data\\"+"customer.csv");
        this.fileCustomerPath = p1.toAbsolutePath(); 

        Path p2 = Paths.get("data\\"+"kitchen.csv");
        this.fileKitchenPath = p2.toAbsolutePath();

        //can be checked on console to be as intended
        System.out.println("Reading File at Location "+fileCustomerPath.toString());
        System.out.println("Reading File at Location "+fileKitchenPath.toString());

        // code after this ***
        System.out.println("*****************************");
       System.out.println("");

        this.parseCustomerFile();
        this.parseKitchenFile();

        /* Reading the File System - Ends  */

       System.out.println("********************");
       System.out.println("");

     }

    public static void main(String[] args)
    {

        SwiggyApp main_app = new SwiggyApp(); // Declare Instantiate and Initialize Object of Class SWiggyApp 

        main_app.readAllData(); // Load all the Data from CSV files into Ram (Objects)

        System.out.println("Welcome to Swiggy App "+main_app.getMain_Customer().Get_name());
        System.out.println("Your current registered phonenumber is "+main_app.getMain_Customer().Get_phoneNumber());

        int tempLength  = main_app.getKitchenList().length;
        Kitchen[] tempKitchenList = main_app.getKitchenList();

        int i = 0;
        while(tempKitchenList[i]!=null)
        {
            System.out.println("***Kitchen Data Begins*** \n");
            System.out.println((tempKitchenList)[i].getName()+" is at location X: "+(tempKitchenList)[i].getLocation().getX_lat()+" Y: "+(tempKitchenList)[i].getLocation().getY_long());
            System.out.println("***Kitchen Data Ends*** \n");
            i++;
        }

        /*
        for(Kitchen k : main_app.getKitchenList())
        {
            System.out.println("***Kitchen Data Begins*** \n");
            System.out.println(k.getName()+" is at location X: "+k.getLocation().getX_lat()+" Y: "+k.getLocation().getY_long());
            System.out.println("***Kitchen Data Ends*** \n");
        }


         */


        /* Reading the File System - Begins  */

       // System.out.println("This is the Basic File Reader");
        //System.out.println("*****************************");
        //System.out.println("");

        

        //Path p1 = Paths.get("data\\"+"customer.csv");
       // filePath = p1.toAbsolutePath();  
        //can be checked on console to be as intended
       // System.out.println("Reading File at Location "+filePath.toString());
        
        // code after this ***
       // System.out.println("*****************************");
       // System.out.println("");

       // parseFile();

        /* Reading the File System - Ends  */


       // System.out.println("********************");
       // System.out.println("");


       // Customer myself = new Customer("Suresh Athiraj","9935237896");
       // System.out.println("Welcome to Swiggy "+myself.Get_name());
       // System.out.println("Your Registered Phone Number is "+myself.Get_phoneNumber());
       // System.out.println(myself.poke());

       // System.out.println("");
       // System.out.println("********************");
        
       // DeliveryGuy firstDelGuy = new DeliveryGuy("001","black_pulsar");

       // System.out.println("Name of the new Del Guy is "+firstDelGuy.Get_name());
       // System.out.println("Emp Id of the new Del Guy is "+firstDelGuy.Get_emp_id());
        //System.out.println("Phone Number of the new Del Guy is "+firstDelGuy.Get_phoneNumber());
       // System.out.println("Vehicle Type of the new Del Guy is "+firstDelGuy.Get_vehicle());
       // System.out.println(firstDelGuy.poke());


        


    }    
}
