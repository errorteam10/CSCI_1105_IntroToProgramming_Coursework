
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Days In The Month
*/

// Importing Tools
import java.util.Scanner;
import java.time.YearMonth;
import java.util.Arrays;

class programming_exercise_4_17 {
	public static void main(String[] args) {
		
		// Define Variables 
		int 		year;
		String 		month;
		YearMonth 	yearMonth;
		int 		selectedMonth;
		Scanner 	user = new Scanner(System.in);
		
		// Define Months
		String[] months = {
			"Jan", 
			"Feb", 
			"mar",
			"apr",
			"may", 
			"jun", 
			"jul",
			"aug", 
			"sep", 
			"oct", 
			"nov",
			"dec"
		};
		
		// get user input for year
		System.out.print("Enter Year: ");
		year = user.nextInt();
		
		// get user input for month
		System.out.print("Enter 3 Char Month: ");
		month = user.next();
		
		// Determine Month Code
		selectedMonth = Arrays.asList(months).indexOf(month);
		
		// Determine If Negative Conversion Is Required
		if(selectedMonth < 0) {
			
			// Define The YearMonth Object		
			yearMonth = YearMonth.of(year, (selectedMonth * -1) + 1);

		} else {
			
			// Define The YearMonth Object		
			yearMonth = YearMonth.of(year, selectedMonth + 1);

		}
				
		// Display To User Days In The Month
		System.out.println(yearMonth.lengthOfMonth());
	}
}