public  class InterfaceTester implements BasicInterface  {

    @Override
    public String printMsg(){

        System.out.println("printMsg() is now implemented");
        return "printMsg() is now implemented";
    }

    public void sayHello()
    {

        System.out.println("Hello from InterfaceTester Object");
    }
     

    public static void main(String[] args){

        System.out.println("everything is fine!");

        InterfaceTester itest = new InterfaceTester();

        itest.sayHello();

    }
    
}
