package LogicalPrograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		int n;
		int rev=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        n = sc.nextInt();
        while(n>0) {
        	rev= (rev*10) +n%10;
        	n=n/10;
        }
        System.out.println("Your reverse number is: " +rev);
	}

}
