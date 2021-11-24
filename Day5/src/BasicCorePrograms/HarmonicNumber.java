package BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber
{

    public static void main(String args[])
    {
        int num, i = 1;
        double result = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of length for series...");
        num = in.nextInt();
        while (i <= num && num!=0)
        {
            System.out.print("1/" + i + " + ");
            result = result + (double) 1 / i;
            i++;
        }
        System.out.println("\n\nSum of Harmonic Series is " + result);
    }
}
