
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Points Within Rectangle
*/

import java.util.Scanner;

class programming_exercise_3_23 {
	public static void main(String[] args) {
		
		// Define Variables
		Scanner user = new Scanner(System.in);
		double x;
		double y;
		
		// get user input for x
		System.out.println("Enter Point X: ");
		x = user.nextDouble();
		
		// get user input for y
		System.out.println("Enter Point Y: ");
		y = user.nextDouble();
		
		// determine if within the rectangle
		if(x <= (10 / 2) && y <= (5.0 / 2)) {
			System.out.println("Point ("+(int)x+", "+(int)y+") Is In Rectangle.");
		} else {
			System.out.println("Point ("+(int)x+", "+(int)y+") Is Not In The Triangle.");
		}
	}
}