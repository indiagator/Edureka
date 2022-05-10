public class Wallet {

    private int balance;


    public Wallet(int balance)
    {
        this.balance = balance;
    }

    public synchronized int getBalance()
    {
        return balance;
    }

    public synchronized int topUp(int topUpAmnt)    
    {

        if(this.balance < 10000) // max wallet value
        {
        this.balance = this.balance + topUpAmnt;
        }

        return balance;

    }

    public synchronized void makePayment(int pymntAmnt, String usrname)
    {

        if(this.balance > pymntAmnt)
        {
        this.balance = this.balance - pymntAmnt;
        System.out.println("A payment is made by "+usrname+" and the new Balance is "+this.balance);
        }
       
    }
}
