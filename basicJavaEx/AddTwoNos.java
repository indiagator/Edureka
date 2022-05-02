package basicJavaEx;

public class AddTwoNos {

    public static void main(String[] args)
    {

        float a = Float.valueOf(args[0]).floatValue();
        float b = Float.valueOf(args[1]).floatValue();

        System.out.println("Sum of The Input Numbers is :"+(a+b));

    }
    
}
