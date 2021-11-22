package employeesProblems;

public class CalculatinMonthlyWage {
	 public static final int isFullTime = 2;
	 public static final int isPartTime = 1;
	 public static final int wagePerHour = 20;
	 public static final int noOfWorkingDays = 2;
	   public static void main(String[] args) {
		
		int empHrs=0;
		int empWage=0;
		int totalEmpWage = 0;
		for(int day=0; day<noOfWorkingDays; day++) {
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		 switch (empCheck) {
		    case isFullTime:
			empHrs = 8;
			break;
		   case isPartTime:
		    empHrs = 4;
			break;
			default:
		    empHrs = 0;

		}
		 empWage = empHrs * wagePerHour;
		 totalEmpWage += empWage;
		 System.out.println("Emp wage: " + empWage);
		}
		System.out.println("Total Employee Wage: " + totalEmpWage);
}
}
