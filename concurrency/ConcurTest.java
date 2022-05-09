public class ConcurTest {

    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {


        Wallet commonWallet = new Wallet(500);

        MyRunnable john = new MyRunnable("John",commonWallet);
        MyRunnable sally = new MyRunnable("Sally",commonWallet);

        Thread john_thread = new Thread(john);
        Thread sally_thread = new Thread(sally);

        john_thread.start();
        sally_thread.start();

       /*
       
        MyThread mt_1 = new MyThread();
        mt_1.start();

        System.out.println("main thread is going to sleep for 10s \n");
        Thread.sleep(10000);
        System.out.println("main thread is awake \n");

        mt_1.join();
        System.out.println("main thread will now exit \n");
       */


        /*

        System.out.println("main thread is going to sleep for 10s \n");
        Thread.sleep(10000);
        System.out.println("maiin thread is interrupting MyThread Now!!!");
        mt_1.interrupt();

        */

       // MyRunnable mr_1 = new MyRunnable();
       // Thread t1 = new Thread(mr_1);
       // t1.start();

       // while(true)
       // {

              //  System.out.println("This is the Main Thread and value of main.i is "+(i++));
               // Thread.sleep(2000);
       // }
        

        /*
        System.out.println("This is the main thread");

        Runnable r1 = new JobOne();
        Runnable r2 = new JobTwo();        

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);        

        t1.start();
        t2.start();;

        

        int i = 0;

        while(i < 10)
        {
        System.out.println("This is the main");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
            e.printStackTrace();
        }

        i++;
        }

        */
    }
    
}
