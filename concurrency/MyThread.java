public class MyThread extends Thread
{

    @Override
    public void run()
    {
        int i = 0;

        //boolean iFlag = Thread.interrupted();

        /*
        try{
        System.out.println("MyThread is going to sleep for 20s");
        Thread.sleep(20000);
        System.out.println("MyThread is awake");
        }
        catch(InterruptedException e)
        {

            e.printStackTrace();
            System.out.println("MainThread got Interrupted");
        }
        */


        while(i < 5)
        {

            System.out.println("This message is coming from MyTHread and the value of MyThread.i is "+(i++));

            try{
            Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
    
}
