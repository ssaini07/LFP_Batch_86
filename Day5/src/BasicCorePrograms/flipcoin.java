package BasicCorePrograms;

import java.util.Random;
import java.util.Scanner;

public class flipcoin
{
	public static void main(String[] args)

	{
		int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many times you want coin to be flipped... ");
        int flips = sc.nextInt();
         
        while(flips >= counter)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < .5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("\n Number of Heads = " + heads);
        System.out.println("\n Number of Tails = " + tails);

	}
}	
        		
