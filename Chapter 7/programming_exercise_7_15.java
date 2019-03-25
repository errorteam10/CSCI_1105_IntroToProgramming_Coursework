
import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 7-15</h1>
* <p>Takes user input for 10 numbers then prints out the distinct values within the array. The same thing as 7-5 basically</p>
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
		int count = 0;
		
		
		
		// Prompt Input from User
		System.out.print("Input 10 numbers separated by a space: ");
		
		// Iterate For Length Array And Collect Input
		for(int i = 0; i < arr.length; i++) {
			
			// Grab next int entered
			arr[i] = user.nextInt();
		}
		
		// Remove duplicate numbers
		arr = eliminateDuplicates(arr);
		
		// Count distinct results
		for(int key : arr) {
			if(key != -1)
				count++;
		}
		
		// Show distinct results to user
		System.out.println("The Number Of Distinct Numbers Is " + count);
		
		// Show array without duplicates.
		System.out.print("Array Without Duplicates: ");
		
		// Iterate through new array
		for(int key : arr) {
			
			// Exclude 0 results
			if(key != -1)
			
				// Print result.
				System.out.print(key + " ");
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
	*1
	1
	*
	*
	*/
	
	public static int[] eliminateDuplicates(int[] list) {
		
		// Method Variables 
		boolean bool = false;
		int[] tempArr = new int[list.length];
		
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = -1;
		}
		
		// Begin iterating to check
		for(int i = 0; i < list.length; i++) {
			
			// Begin Checking Temparr
			for(int key : tempArr) {
				
				// If key exists in Temparr already, then stop.
				if(key == list[i]) {
					bool = true;
					break;
				} else {
					bool = false;
				}
			}
			
			// If not found. Add it.
			if(!bool) {
				tempArr[i] = list[i];
			}
			
		}
		
		// Return array to main()
		return tempArr;

	}
}