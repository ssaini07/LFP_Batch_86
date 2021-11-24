package BasicCorePrograms;

import java.util.Scanner;

public class vowelconsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here, word to check:");
		char ch = sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println("Choosen word is a vowel");
		}
		else {
			System.out.println("Choosen word is a consonant: ");
		}
	}

}
