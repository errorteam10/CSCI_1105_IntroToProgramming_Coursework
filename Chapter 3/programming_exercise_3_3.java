/*
* - Brent Dalling
* - March 25th, 2019
*
* - Takes User Input To Determine Solution To equation
*/


import java.util.Scanner;

class programming_exercise_3_3 {
	public static void main(String[] args) {
		
		// Define Variables 
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		
		// Added Values
		double ad;
		double bc;
		double ed;
		double bf;
		double af;
		double ec;
		
		// Solutions
		double x;
		double y;
		
		// Check bool
		double check;
		
		// New Scanner
		Scanner user = new Scanner(System.in);
		
		// Ask User For Each Value
		System.out.println("Enter a: ");
		a = user.nextDouble();
		System.out.println("Enter b: ");
		b = user.nextDouble();
		System.out.println("Enter c: ");
		c = user.nextDouble();
		System.out.println("Enter d: ");
		d = user.nextDouble();
		System.out.println("Enter e: ");
		e = user.nextDouble();
		System.out.println("Enter f: ");
		f = user.nextDouble();
		
		// Add Everything To Matching Values
		ad = a * d;
		bc = b * c;
		ed = e * d;
		bf = b * f;
		af = a * f;
		ec = e * c;
		
		// Getting Value
		check = ad - bc;
		
		System.out.println(check);
		
		// Checking if ad-bc = Zero to prevent zero division.
		if(check == 0) {
			
			System.out.println("Cannot Divide By Zero");
			
		} else {
			
			// Determine Solutions
			x = (ed - bf) / (ad - bc);
			y = (af - ec) / (ad - bc);
			
			// Print Solutions to User
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		
	}
}