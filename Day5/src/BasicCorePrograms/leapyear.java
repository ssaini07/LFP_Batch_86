package BasicCorePrograms;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		long year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year you want to check is leap year or not");
		year = sc.nextLong();
		if(year % 4==0 && year % 100 !=0 || year %400 ==0) {
			System.out.println("Entered year is a leap year: " + year);
		}
		else {System.out.println("Entered year is not a leap year");}

	}

}
