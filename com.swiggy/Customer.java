public class Customer extends Human {


    private Location location;
    private Wallet wallet;

    public Customer(String name){

        super.name = name;
    }   
    

    public Customer(String name, String phoneNumber,Location location, Wallet wallet){

        this.wallet = wallet;
        this.location = location;
        super.name = name;
        super.phoneNumber = phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public Wallet getWallet() {
        return wallet;
    }

    @Override
    public void setBodyTemp(double bodyTemp) {
        super.setBodyTemp(bodyTemp);
    }

    @Override //annotation
    public String poke()
    {
        return "I have now decided to become a Customer";
    }
    
    
}
