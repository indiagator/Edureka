public class Wallet {

    private int balance;



    public Wallet(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public int topUp(int topUpAmnt)    
    {
        balance = balance + topUpAmnt;
        return balance;
    }

    public int makePayment(int pymntAmnt)
    {

        balance = balance - pymntAmnt;
        return balance;
    }
}
