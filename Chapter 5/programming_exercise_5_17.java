
/*
* - Brent Dalling
* - March 6th, 2019
*
* - TMaking Triangles Of Numbers From User Input
*/

import java.util.Scanner;

class programming_exercise_5_17 {
	public static void main(String[] args) {
		
		// Define Variables 
		Scanner user = new Scanner(System.in);
		int rows;
		
		// Get User Input 
		System.out.print("How Many Rows? ");
		rows = user.nextInt();
		
		// Loop First Set
		for(int first = 1; first <= rows; first++) {
			
			// Defining The Spacing
			for (int current = 1; current <= rows - first; current++) {
				System.out.printf("%3s", "");
			}
			
			// Left Side
			for (int current = first; current >= 1; current--) {
				System.out.printf("%3d", current);
			}	
			
			// Right Side
			for (int current = 2; current <= first; current++) {
				System.out.printf("%3d", current);
			}
			
			//  newline
			System.out.printf("\n");
		}
		
		
		
	}
}