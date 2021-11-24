package BasicCorePrograms;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers to find largest among them:");
		int first = sc.nextInt();
		int sec = sc.nextInt();
		int third = sc.nextInt();
		int temp, result;
		temp = first>sec ? first:sec;
		result = temp>third ? temp:third;
		System.out.println("Your largest number is : " + result);

	}

}
