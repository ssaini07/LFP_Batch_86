package BasicCorePrograms;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to check is even or odd:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is even:");
		}
			else {
				System.out.println("Number is odd:");
			
		}

	}

}
