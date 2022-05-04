import java.util.Scanner;
import animals.Pet;
import animals.Cat;
import animals.Dog;

/** This program is an example of (Runtime) Polymorphism */

public class TesterClass 
{

    public static int x = 5; // Java is Pass by Value!!!, If you want to Pass Reference, then pass Object Reference

    public static void main(String[] args)
     {      
         
        /*

        increment(x);
        System.out.println(x);

        */
        
      //  FirstClass firstClass_1 = new FirstClass();

       // System.out.println("Sum of Two nOs is :"+ ( firstClass_1.add(5,6)) );

        //Cat i = new Cat();

       // System.out.println(String.valueOf("class").length());

       Scanner in = new Scanner(System.in);

       System.out.println("What kind of pet do you want (None'0', Dog'1', Cat'2')?");
       int petType = in.nextInt();

      // System.out.println(i.poke());

       Pet myPet=null;



       if(petType == 0)
       {
            //myPet = new Pet();can't be done as Class Pet is Abstract
            System.out.println("I'm so sorry you don't want to have a pet");
       }
       else if(petType == 1){
           myPet = new Dog();
       }
       else
       {
           myPet = new Cat();
       }

       
       
       try {

        System.out.println(myPet.poke());
           
       } catch (Exception e) {

        System.out.println("There's no Pet to Poke ((");
        System.out.println(e.toString());
        
           //TODO: handle exception
       }

       System.out.println(myPet.getClass());

                 
    }

    public static void  increment(int a)
    {
            System.out.println(++a);
    }

    
}
    

