import java.util.Scanner;

import com.epochConverter.*;

public class timeClock {
	
	// Class wide epoch variable ties to the epochConverter Class.
	private static epochConverter epoch = new epochConverter();
	
	// Class Wide Access To Scanner
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Main() Variables 
		int time;
		String[] converted;
		
		// Get The Epoch Time To Be Converted From The User
		time = getInputTime();
		
		converted  = epoch.all(time);
		
		for (String e: converted) {
			System.out.println(e);
		}
		
	}
	
	
	public static int getInputTime() {
		
		// getInputTime() Variables 
		boolean generator = true;
		int time = 0;
		
		// Repeat Epoch Time Collection Request Until Valid Input
		while (generator) {
			
			// Ask For User Input
			System.out.print("Enter Epoch Time: ");
			
			// Assign [time] To User Input
			time = input.nextInt();
			
			// If Valid Input
			if(time != 0) {
				
				// Stop Loop
				generator = false;
			}
		}
		
		// Return Input
		return time;
	}
}