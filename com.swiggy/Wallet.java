public class Wallet {

    private int balance = 0;

    public Wallet(int balance){

        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    /** Tops up and returns the updated Balance*/
    public int topUp(int amnt)
    {

        this.balance = this.balance + amnt;
        return this.balance;
    }

    public boolean makePaymnt(int amnt)  {

        boolean success_flag=false;

        if(this.balance >= amnt) {
            this.balance = this.balance - amnt;
            success_flag = true;
        }
        else
        {
            //throw new Exception("Insufficient Funds, Please topUp the Wallet");
            //throw new RuntimeException("Insufficient Funds, Please topUp the Wallet");
        }

        return success_flag;

    }
}
