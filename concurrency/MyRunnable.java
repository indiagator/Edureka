public class MyRunnable implements Runnable {

    private String userName;
    private Wallet userWallet;

    public MyRunnable(String userName, Wallet w)
    {
        this.userName = userName;
        this.userWallet = w;
    }

    @Override
    public void run()  {
        // TODO Auto-generated method stub

        int i = 0;

        while(true)
        {

           // System.out.println("This message is coming from MyRunnable and the value of MyRunnable.i is "+(i++));


            try{
            Thread.sleep(3000);
                if(userWallet.getBalance() > 100)
                    {
                    System.out.println(this.userName+"just made a withdrawal and the new balance is INR"+userWallet.makePayment(100));
                    }        
                    //else{}
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}
