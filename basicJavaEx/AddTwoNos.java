package basicJavaEx;

public class AddTwoNos {

    public static void main(String[] x)
    {

        

        float a = Float.valueOf(x[0]).floatValue();
        float b = Float.valueOf(x[1]).floatValue();
        float c = Float.valueOf(x[2]).floatValue();


        System.out.println("Sum of The Input Numbers is :" + (a+b+c) );

    }
    
}
