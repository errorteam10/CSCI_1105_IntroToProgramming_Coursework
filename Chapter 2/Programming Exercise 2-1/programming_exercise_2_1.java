/*
* - Brent Dalling
* - March 25th, 2019
*
* - Takes User Input And Converts Celsius to Fahrenheit
*/

// Imports The Java Utility Scanner
import java.util.Scanner;

// Our Class
class Untitled {
	public static void main(String[] args) {
		
		// Init The Scanner
		Scanner user = new Scanner(System.in);
		
		// Declare Variables 
		double celsius;
		double fahrenheit;
		String userInput;
		
		// Ask User For Input
		System.out.println("Please Enter Celsius Temp To Convert: _ ");
		
		// Get User Input
		celsius = user.nextDouble();
		
		// Thank User For Input 
		System.out.println("Thank you. Converting now.");
		
		// Perform Conversion. 
		fahrenheit = ((9.0/5) * celsius + 32);
		
		// Moves Previous User Input Out Of View
		for(int i = 0; i < 100; i++) {
			System.out.println(" ");
		}
		
		// Display The Conversion To The User
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");		
	}
}