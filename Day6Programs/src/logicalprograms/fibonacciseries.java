package LogicalPrograms;
import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int term=1;
	        System.out.println("Enter your value");
	        int x=0, y=1, z=0, n;
	        n=sc.nextInt();
	        while(term<=n) {
	        	System.out.println(z);
	        	x=y;
	        	y=z;
	        	z=x+y;
	        	term=term+1;
	        }

	}

}
