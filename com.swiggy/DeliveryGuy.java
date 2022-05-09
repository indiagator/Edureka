
public class DeliveryGuy extends Human 
{
    private final String emp_id; // employee id will have only numbers no characters and will not change, EVER!!!    
    private String vehicle; // String for now but it will be converted to an Object of Class Vehicle in the future

    public DeliveryGuy(String emp_id,String vehicle )
    {
        this.emp_id = emp_id;       
        this.vehicle = vehicle;
    }


    public String Get_emp_id()
    {
        return this.emp_id;
    }
   

    public String Get_vehicle()
    {
        return this.vehicle;
    }

    @Override //annotation
    public String poke()
    {
        return "I have now decided to become a Delivery Guy";
    }
    
    
}
