package BasicCorePrograms;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers you want to swap");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int temp;
		System.out.println("Before swapping: " + first + " " + second);
		temp=first;
		first=second;
		second=temp;
		System.out.println("After swapping: " + first + " " + second);

	}

}
