/*
* - Brent Dalling
* - March 18th, 2019
*
* - Takes User Input And Creates Matrix
*/

import java.util.Scanner;

class programming_exercise_6_25 {
	public static void main(String[] args) {
		
		// Variables 
		Scanner input = new Scanner(System.in);
		
		// Prompt User For Input
		System.out.print("Enter Time In Milliseconds: ");
		
		// Print Result After Converting
		System.out.println(
		
			// Convert Captured Input
			convertMillis(input.nextLong())
		);
	}
	
	// Convert Milliseconds To Hours, Minutes, Seconds.
	public static String convertMillis(long millis) {
	 	 
		// Method Specific Variables 
		long hours;
		long minutes;
		long seconds;
		
		// Convert To Hours
		hours = millis / 3600000;
		
		// Convert To Minutes
		minutes = (millis - (hours * 3600000)) / 60000;
		
		// Convert To Seconds
		seconds =  (millis - (hours * 3600000 + minutes * 60000)) / 1000;
		
		// Return String Of Converted Values
		return hours + ":" + minutes + ":" + seconds;
	}
}