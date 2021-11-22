package employeesProblems;

public class PartTimeEmployee {

	public static void main(String[] args) {
		int isFullTime = 2;
		int isPartTime = 1;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTime= 4;
		int dailyEmployeeWage = 0;
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		if (empCheck == isFullTime) {
			dailyEmployeeWage = fullDayHour * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
		}
		else if(empCheck == isPartTime) {
			dailyEmployeeWage = partTime * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
		}
		else {
			dailyEmployeeWage =  empHrs * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
		}

	}

}
