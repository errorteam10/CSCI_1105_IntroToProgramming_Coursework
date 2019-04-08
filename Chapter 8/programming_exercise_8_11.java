import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 8-11</h1>
* <p>Takes user input, converts to formatted decimal, then iterates to decide heads or tails.</p>
*
*/

class Programming_exercise_8_11 {
	public static void main(String[] args) {
		
		// Variables 
		String binaryConv = "";
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		int numConv;
		
		// Get User Input
		System.out.print("Enter Number Between 0 - 511: ");
		
		// Record Input
		numConv = input.nextInt();
		
		// Convert To Binary
		binaryConv = String.format("%9s", Integer.toBinaryString(numConv)).replace(" ", "0");
		
		// Show Converted Number
		System.out.println("Converted: " + binaryConv);
		
		// Iterate the Length (Should Always Be 9)
		for(int i = 0; i < binaryConv.length(); i++) {
			
			// If character at i is 0 then...
			if(binaryConv.charAt(i) == '0') {
				
				// Print Heads
				System.out.print("H");
			} else {
				
				// Print Tails
				System.out.print("T");
			}
			
			// At Specified Iterator Print new line.
			if (i == 2 || i == 5) {
				System.out.println(" ");
			}
		}
	}
}