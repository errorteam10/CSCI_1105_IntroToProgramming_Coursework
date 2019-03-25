
import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 7-5</h1>
* <p>Takes user input for 10 numbers then prints out the distinct values within the array.</p>
*
*/

class programming_exercise_7_5 {
	
	/**
	*
	* <h1>main()</h1>
	* <p>Application entry point. Collects user input to begin comparisons and array storage.</p>
	*
	*/
	
	public static void main(String[] args) {
		
		// Declare Variables
		Scanner user = new Scanner(System.in);
		int[] arr = new int[10];
		Boolean check;
		int count = 0;
 		int input;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		// Prompt Input from User
		System.out.print("Input 10 numbers separated by a space: ");
		
		// Iterate For Length Array And Collect Input
		for(int i = 0; i < arr.length; i++) {
			
			// Grab next int entered
			input = user.nextInt();
			
			// Get boolean regarding if duplicate
			check = Check(arr, input);
			
			// If not a duplicate
			if(!check) {
				
				// Array at point = input
				arr[count] = input;
				
				// Add 1 to the count
				count++;
			}
		}
		
		// Show Number Distinct Numbers
		System.out.println("The Number Of Distinct Numbers Is: " + count);
		
		// Begin Showing Array Without Duplicates
		System.out.print("Array Without Duplicates: ");
		
		// Iterate To Remove Zeros
		for(int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
		}
	
	}
	
	/**
	*
	*
	*	<h1>Check()</h1>
	*   <p>Checks if numbers inputed are located in array. Returns true if a value exists in the array or false if it doesnt.</p>
	*
	*
	*	@param arr (int[]; Array value being checked)
	*	@param query (int; The number we are checking for.)
	*
	*	@return bool (boolean; Returns true or false)
	*
	*
	*
	*/
	
	public static boolean Check(int[] arr, int query) {
		for(int key : arr) {
			if (key == query)
				return true;
		}
		
		return false;
	}
}