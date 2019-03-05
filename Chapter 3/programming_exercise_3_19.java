
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Takes User Input To Determine Perimeter Of Triangle
*/


import java.util.Scanner;

class programming_exercise_3_19 {
	public static void main(String[] args) {
		
		// Define Variables 
		double sideA;
		double sideB;
		double sideC;
		
		// Added Variables 
		double total;
		
		// User Variables 
		Scanner user = new Scanner(System.in);
		
		// Get the Triangle Side A
		System.out.println("Enter Side A: ");
		sideA = user.nextDouble();
		
		// Get The Triangle Side B
		System.out.println("Enter Side B: ");
		sideB = user.nextDouble();
		
		// Get The Triangle Side C
		System.out.println("Enter Side C: ");
		sideC = user.nextDouble();
		
		// Total Perimeter
		total = sideA + sideB + sideC;
		
		// Determine If A Triangle
		if(sideA + sideB > sideC) {
			System.out.println("You Have A Triangle! A " + total);
		} else {
			System.out.println("Not A Triangle!");
		}
		
	}
}