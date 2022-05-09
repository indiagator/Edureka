 

public class JobTwo implements Runnable {

    @Override
    public void run() 
     {
        // TODO Auto-generated method stub

        int i = 0;

        while(i < 10)
        {
        System.out.println("Job Two is successful");

        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            
            e.printStackTrace();
        }
        
        i++;
        }
        
    }
    
}
