package BasicCorePrograms;

import java.util.Scanner;

public class quotientremainder {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of Dividend and Divisor:");
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int quot, rem = 0;
		quot = dividend/divisor;
		rem = dividend % divisor;
		System.out.println("Quotient when " + dividend + "/" + divisor + " is: " + quot);
		System.out.println("Remainder when " + dividend + " is divided by " + divisor + " is: " + rem);
	}

}
