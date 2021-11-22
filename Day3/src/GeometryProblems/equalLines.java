package GeometryProblems;

import java.util.Scanner;

public class equalLines {
	public static void main(String[] args) {

		String x1, x2, y1, y2;
		double p1, p2;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = sc.next();

		System.out.println("enter y1 point");
		y1 = sc.next();

		System.out.println("enter x2 point");
		x2 = sc.next();

		System.out.println("enter y2 point");
		y2 = sc.next();

		System.out.println("Result1:" + x1.equals(x2));
		System.out.println("Result2:" + y1.equals(y2));

		if (x1.equals(x2) && y1.equals(y2)) {
			System.out.println("Two lines are equal");
		} else {
			System.out.println("Two lines are not equal");
		}
	}
}
