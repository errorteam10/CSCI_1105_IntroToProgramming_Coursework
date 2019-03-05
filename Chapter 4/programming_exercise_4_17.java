
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Days In The Month
*/

import java.util.Scanner;

class programming_exercise_4_17 {
	public static void main(String[] args) {
		
		// Define Variables 
		boolean leap;
		String 	month; 
		int 	year;
		Scanner user = new Scanner(System.in);
		
		// get year from the user 
		System.out.println("Enter Year: ");
		year = user.nextInt();
		
		// get the month from the user
		System.out.println("Enter Month: ");
		month = user.next();
		
		// determine days in month
		if(month.equals("jan") || month.equals("mar") || month.equals("may") || month.equals("jul") || month.equals("aug") || month.equals("oct") || month.equals("dec")) {
			
			// Display Amount Of Days In Month
			System.out.println(month + " has 31 days.");
			
		} else if(month.equals("apr") || month.equals("jun") || month.equals("sep") || month.equals("nov")) {
			
			// Display Amount Of Days In Month
			System.out.println(month + " has 30 days.");
			
		} else if(month.equals("feb")) {
			
			// Determine If Leap Year And Then Display To User
			System.out.println(month + " has " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "29" : "28") + " days.");
		} else {
			System.out.println(month + " Is Not A Valid Month.");
		}
		
	}
}