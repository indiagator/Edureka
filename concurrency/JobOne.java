 

public class JobOne implements Runnable {

    @Override
    public void run()
     {
        // TODO Auto-generated method stub

        int i = 0;

        while(i < 10)
        {
        System.out.println("Job One is successful");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
            e.printStackTrace();
        }

        i++;
        }
    }
    
}
