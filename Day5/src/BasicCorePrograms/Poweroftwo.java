package BasicCorePrograms;

import java.util.Scanner;

public class Poweroftwo {

	public static void main(String[] args) {
	
        int N;
        int base=2;
        int result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        N = sc.nextInt();
        while(N > 0 && N < 31) {
        	result = result*base;
        	N--;
        }
        System.out.println("Your result is : " + result);
	}

}
