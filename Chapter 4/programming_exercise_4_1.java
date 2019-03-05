
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Area Of Pentagon
*/

import java.util.Scanner;
import java.math.*;

class programming_exercise_4_1 {
	public static void main(String[] args) {
		
		// Define Variables 
		double area;
		double length;
		double s;
		Scanner user = new Scanner(System.in);
		
		// Get User Input 
		System.out.print("Length From Center To Vertex? ");
		length = user.nextDouble();
		
		// Determine The Value Of S
		s = (2 * length) * Math.sin(Math.PI/5);
		
		// Determine The Area
		area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		// Display And Round To Nearest 2 Decimals.
		System.out.println(Math.round(area * 100) / 100.0);
		
	}
}