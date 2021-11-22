package employeesProblems;

public class DailyEmployeeWage {

	public static void main(String[] args) {
		int isFullTime = 1;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailyEmployeeWage = 0;
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		if (empCheck == isFullTime) {
			dailyEmployeeWage = fullDayHour * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
		}
		else {
			dailyEmployeeWage =  empHrs * wagePerHour;
			System.out.println("Employee wage is: " + dailyEmployeeWage);
		}

	}

}
