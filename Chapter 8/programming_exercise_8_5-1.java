import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 7-23</h1>
* <p>Inputs matrices to a two dimensional array and adds them together.</p>
*
*/

class programming_exercise_8_5 {
	public static void main(String[] args) {
		
		// Variables 
		Scanner user = new Scanner(System.in);
		double[][] matrixA = new double[3][3];
		double[][] matrixB = new double[3][3];
		double[][] total   = new double[3][3];
		
		// Get 3 doubles
		for(int i = 0; i < 3; i++) {
			
			// Prompt User:
			System.out.print("Enter Matrix Set 1-" + i + " Separated By A Space: ex(1 2 3) _ ");
			
			// Iterate The 1st dimension
			for(int j = 0; j < 3; j++) {
				
				// set [row 1][column i] = input double.
				matrixA[j][i] = user.nextDouble();
			}
		}
		
		
		
		// Get 3 doubles
		for(int i = 0; i < 3; i++) {
			
			// Prompt user
			System.out.print("Enter Matrix Set 2-" + i + " Separated By A Space: ex(1 2 3) _ ");
			
			// Iterate The 1st dimension
			for(int j = 0; j < 3; j++) {
				
				// set [row 1][column i] = input double.
				matrixB[j][i] = user.nextDouble();
			}
		}
		
		// Add together arrays
		total = addMatrix(matrixA, matrixB);
		
		// Show totals to user
		System.out.println("Totals: ");
		
		// Iterate First Dimension
		for(int i = 0; i < 3; i++) {
			
			// Iterate Second Dimension
			for(int j = 0; j < 3; j++) {
				
				// Output Matrix
				System.out.print(total[j][i] + " ");
			}
			
			System.out.println(" ");
		}
		
	}
	
	
	// Adds matrices together.
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		// New 
		double[][] $return  = new double[3][3];
		
		// Iterate Second Dimension
		for(int i = 0; i < 3; i++) {
			
			// Iterate First Dimension
			for(int j = 0; j < 3; j++) {
				
				// Add Matrix
				$return[j][i] = a[j][i] + b[j][i];
			}
		}
		
		// Return Data
		return $return;
	}
	
}