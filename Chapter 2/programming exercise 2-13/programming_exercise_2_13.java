/*
* - Brent Dalling
* - March 25th, 2019
*
* - Takes User Input and Forcasts Savings Compound
*/

// Import The Java Utility Library
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		// Define Variables 
		Scanner user = new Scanner(System.in);
		double savingsPerMonth;
		double rate;
		double total_savings = 0.0;
		
		// Get User Input 
		System.out.println("Enter Monthly Savings Amount.");
		savingsPerMonth = user.nextDouble();
		total_savings = savingsPerMonth;
		
		rate = 1 + (0.05 / 12);
		
		// Calculate The Amounts 6 TIMES
		total_savings = savingsPerMonth + (total_savings * rate);
		total_savings = savingsPerMonth + (total_savings * rate);
		total_savings = savingsPerMonth + (total_savings * rate);
		total_savings = savingsPerMonth + (total_savings * rate);
		total_savings = savingsPerMonth + (total_savings * rate);
		total_savings = savingsPerMonth + (total_savings * rate);
				
		// Show To the User
		System.out.println("Savings after 6 months: " + Double.toString(total_savings - savingsPerMonth));
		
	}
}