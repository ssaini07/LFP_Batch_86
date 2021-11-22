package employeesProblems;

public class UsingSwitchCase {
	
	 public static final int isFullTime = 2;
	 public static final int isPartTime = 1;
	public static void main(String[] args) {
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTime= 4;
		int dailyEmployeeWage = 0;
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		 switch (empCheck) {
		    case isFullTime:
			dailyEmployeeWage = fullDayHour * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
			break;
		   case isPartTime:
		dailyEmployeeWage = partTime * wagePerHour;
	    System.out.println("Employee wage is: " + dailyEmployeeWage);
			break;
			default:
		dailyEmployeeWage =  empHrs * wagePerHour;
		System.out.println("Employee wage is: " + dailyEmployeeWage);

		}
}
}