
import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 7-23</h1>
* <p>PUZZLE!!!!!!!!! </p>
*
*/

class Untitled {
	public static void main(String[] args) {
		
		// Variables 
		boolean[] lockers = new boolean[10];
		int students = 7;                                 
		
		// Begin Students
		for(int i = 1; i <= students; i++) {
			
			// Student Opens/Closes Which Lockers?
			for(int j = i; j < lockers.length; j += i) {
				
				// Locker = locker - 1;
				j -= 1;
				
				// If Locker True
				if(lockers[j]) {
					lockers[j] = false;
				} else {
					lockers[j] = true;
				}
				
				// locker = locker + 1;
				j += 1;
			}
		}
		
		// Iterate and show if open or closed.
		for(int i = 0; i < lockers.length; i++) {
			if(lockers[i]) {
				System.out.println("Locker " + i + " open.");
			} else {
				System.out.println("Locker " + i + " closed.");
			}
		}
	}
}