package LogicalPrograms;
import java.util.*;
public class primenumber {
	public static void main(String[] args) {
int n, temp=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number here: ");
n=sc.nextInt();
for(int i=2; i<=(n-1); i++) {
	if(n%i==0) {
		temp=temp+1;
	}
}
if(temp>0) {
	System.out.println("Number is prime");
}
else {
	System.out.println("Number is not prime");
}
}
}