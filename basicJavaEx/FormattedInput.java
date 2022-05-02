package basicJavaEx;

import java.util.Scanner;

public class FormattedInput {

    public static void main (String[] args)
    {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter First Number :");
            int a = in.nextInt();

            System.out.print("Enter Second Number :");
            int b = in.nextInt();

            System.out.print("Sum of the two numbers is :"+ (a+b) );

    } 
    
}
