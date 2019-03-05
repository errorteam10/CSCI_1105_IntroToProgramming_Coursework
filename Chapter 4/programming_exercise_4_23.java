
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Payroll Statement
*/

import java.util.Scanner;

class programming_exercise_4_23 {
	public static void main(String[] args) {
		
		// define variables 
		Scanner user = new Scanner(System.in);
		double hoursWorked;
		double hourlyWage;
		double fWithholding;
		double sWithholding;
		String employeName;
		
		// Compute Variables 
		double grossPay;
		double fDeduction;
		double sDeduction;
		
		// Get User Input
		System.out.print("Enter Employee's Name: ");
		employeName = user.nextLine();
		
		System.out.print("Enter Hours Worked: ");
		hoursWorked = user.nextDouble();
		
		System.out.print("Enter Hourly Pay: ");
		hourlyWage = user.nextDouble();
		
		System.out.print("Enter Federal Withholding Rate: ");
		fWithholding = user.nextDouble();
		
		System.out.print("Enter State Withholding Rate: ");
		sWithholding = user.nextDouble();
		
		// Compute Results 
		grossPay = hoursWorked * hourlyWage;
		
		// Determine If Federal Withholding Rates Are Already Decimal Form.
		if(fWithholding >= 1) {
			fDeduction = grossPay * (fWithholding / 100);
		} else {
			fDeduction = grossPay * fWithholding;
		}
		
		// Determine if state withholding rates are already decimal form.
		if(sWithholding > 1) {
			sDeduction = grossPay * (sWithholding / 100);
		} else {
			sDeduction = grossPay * sWithholding;
		}
		
		// Show Employee Name
		System.out.println("Employee Name: " + employeName);
		
		// Display Hours Worked
		System.out.println("Hours Worked: " + hoursWorked);
		
		// Display pay rate
		System.out.printf("Pay Rate: $%4.2f \n", hourlyWage);
		
		// Display gross pay
		System.out.printf("Gross Pay: $%4.2f \n", grossPay);
		
		// Display Deductions
		System.out.println("Deductions: ");
			System.out.printf("	Federal Withholding (%4.2f%%) $%4.2f \n", (fWithholding > 1 ? fWithholding / 100 : fWithholding ), fDeduction);
			System.out.printf(" 	State Withholding (%4.2f%%) $%4.2f \n", (sWithholding > 1 ? sWithholding / 100 : sWithholding ), sDeduction);
			System.out.printf(" 	Total Withholding $%4.2f \n", fDeduction + sDeduction);
					
		// Show Net Pay
		System.out.printf("Net Pay: $%4.2f \n", (grossPay - (fDeduction + sDeduction)));
		
	}
}