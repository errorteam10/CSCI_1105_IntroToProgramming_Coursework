/*
* - Brent Dalling
* - March 18th, 2019
*
* - Takes User Input And Creates Matrix
*/

import java.util.Scanner;

class programming_exercise_6_37 {
	public static void main(String[] args) {
		
		// Variables 
		Scanner input = new Scanner(System.in);
		int number;
		int width;
		String format;
		
		// Get User Input 
		System.out.print("Enter Number: ");
		number = input.nextInt();
		
		System.out.print("Enter Length: ");
		width = input.nextInt();
		
		// Format The Data
		format = format(number, width);
		
		// Display Result To User
		System.out.println(format);
		
	}
	
	// Converts To Prefixed String 
	public static String format(int number, int width) {
		
		// Method Variables 
		int length = (int) (Math.log10(number) + 1);
		String formatted = "";
		
		// Run Prefix
		for(int i = 0; i < width - length; i++) {
			formatted += "0";
		}
		
		// Return String
		return formatted + number;
	}
}