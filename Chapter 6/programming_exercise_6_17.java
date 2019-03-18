/*
* - Brent Dalling
* - March 18th, 2019
*
* - Takes User Input And Creates Matrix
*/

import java.util.Scanner;

class programming_exercise_6_17 {
	public static void main(String[] args) {
		
		// Variables 
		Scanner input = new Scanner(System.in);
		
		// Prompt User
		System.out.print("Enter n: ");
		
		// Capture User Input
		printMatrix(input.nextInt());
	}
	
	// print The Matrix
	public static void printMatrix(int n) {
		
		// Loop For Result
		for(int i = 1; i <= n; i++) {
			
			// Loop for columns
			for(int c = 0; c < n; c++) {
				
				// Print 0 or 1
				System.out.print((int)(Math.random() * 2));
			}
			
			// Print A Break
			System.out.println();
		}
	}
}