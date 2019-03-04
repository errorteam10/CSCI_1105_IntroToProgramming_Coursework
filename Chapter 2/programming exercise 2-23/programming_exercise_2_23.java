/*
* - Brent Dalling
* - March 25th, 2019
*
* - Takes User Input and Forcasts Savings Compound
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		// Define Variables
		Scanner user = new Scanner(System.in);
		double distance;
		double ppg;
		double mpg;
		double cost;
		
		System.out.println("Distance In Miles?");
		distance = user.nextDouble();
		
		System.out.println("MPG of vehicle?");
		mpg = user.nextDouble();
		
		System.out.println("Price Per Gallon");
		ppg = user.nextDouble();
		
		cost = (distance / mpg) * ppg;
		
		System.out.println("Trip Cost: $" + cost);
	}
}