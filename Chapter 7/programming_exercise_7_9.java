
import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 7-9</h1>
* <p>Takes user input for 10 numbers then prints out the minimum array value.</p>
*
*/

class programming_exercise_7_9 {
	
	/**
	*
	*	<h1>main()</h1>
	*	<p>Program Entry Point</p>
	*
	*
	*/
	public static void main(String[] args) {
		
		// Declare Variables 
		Scanner user = new Scanner(System.in);
		double[] arr = new double[10];
		double num;
		
		// Prompt And Collect User Input n times. 
		System.out.print("enter 10 Numbers Separated By A Space: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = user.nextDouble();
		}
		
		// Sort Array
		sort(arr);
		
		// Show To User
		System.out.println("The Minimum Number Is: " + arr[0]);
		
	}
	
	
	/**
	*
	* <h1>sort()</h1>
	* <p>Take an array and sorts its values from least to greatest.</p>
	* 
	* @param arr (double[]; Array in which we are sorting.)
	*
	*/
	
	public static void sort(double[] arr) {
		
		// Declare Method Variables
		double 	currentMin;
		int 	currentIndex;
		
		// Begin Sorting
		for(int i = 0; i < arr.length -1; i++) {
			
			// Find min
			currentMin = arr[i];
			currentIndex = i;
			
			// Second Iteration
			for(int j = i + 1; j < arr.length; j++) {
				if(currentMin > arr[j]) {
					currentMin = arr[j];
					currentIndex = j;
				}
			}
			
			// Swap Array
			if(currentIndex != i) {
				arr[currentIndex] = arr[i];
				arr[i] = currentMin;
			}
		}
	}

}