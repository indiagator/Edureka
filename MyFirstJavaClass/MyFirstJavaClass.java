//there should be no package declaration here if you want to compile the file from within the folder
//Compile and Run the file from outside the folder if you want to declare a Package

public class MyFirstJavaClass {

    private int x = 12;
    private int y = 17;

    public static void incrementAndAddPrmitives(int x, int y)
    {

        System.out.println( (++x) + (++y) );

    }

    public static void incrementAndAddObjectMembers(MyFirstJavaClass mfc)
    {

        System.out.println( (++mfc.x) + (++mfc.y) );

    }

        public static void main (String... args)
        {
            System.out.println("Hello World");

            int a = 5;
            int b = 7;

            incrementAndAddPrmitives(a, b);

            System.out.println("value of a is "+a);
            System.out.println("value of b is "+b);

            System.out.println("****");
            System.out.println("");

            MyFirstJavaClass mfc_ref_var = new MyFirstJavaClass();

            incrementAndAddObjectMembers(mfc_ref_var);

            System.out.println("changed value of x is "+mfc_ref_var.x);
            System.out.println("changed value of y is "+mfc_ref_var.y);





        }
    
}