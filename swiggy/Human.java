public class Human  
{

    protected String name; //name of the human may change
    protected String phoneNumber; //phonenumber can have only digits and some special characters "+" and it can change
    private double bodyTemp; // body tempeparure of the human

    /*
    public Human(String name,String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    
    */

    public String Get_name()
    {
        return this.name;
    }
    public String Get_phoneNumber()
    {
        return this.phoneNumber;
    }

    public Double Get_bodyTemp()
    {
        return this.bodyTemp;
    }

    public String poke()
    {
        return "This Human has still not found his purpose in life";
    }
    
}
