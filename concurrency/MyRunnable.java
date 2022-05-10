public class MyRunnable implements Runnable {

    private String userName;
    private Wallet userWallet;
    private int freq;
    private int withdrawalAmnt;

    public MyRunnable(String userName, Wallet w, int freq, int withdrawalAmnt)
    {
        this.userName = userName;
        this.userWallet = w;
        this.freq = freq;
        this.withdrawalAmnt = withdrawalAmnt;
    }

    @Override
    public void run()  {
        // TODO Auto-generated method stub

        int i = 0;

        while(true)
        {

           // System.out.println("This message is coming from MyRunnable and the value of MyRunnable.i is "+(i++));


            try{
                    //System.out.println(this.userName+"just made a withdrawal and the new balance is INR"+userWallet.makePayment(100));
                    this.userWallet.makePayment(this.withdrawalAmnt, this.userName);
                    Thread.sleep(this.freq);                

                }
                catch(InterruptedException e)
                {
                e.printStackTrace();
                }
        }
    }
    
}
