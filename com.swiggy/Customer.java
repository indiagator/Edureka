public class Customer extends Human {


    public Customer(String name){

        super.name = name;
    }   
    

    public Customer(String name, String phoneNumber){

        super.name = name;
        super.phoneNumber = phoneNumber;
    }

    @Override //annotation
    public String poke()
    {
        return "I have now decided to become a Customer";
    }
    
    
}
