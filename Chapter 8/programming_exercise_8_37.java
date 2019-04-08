import java.util.Scanner;
import java.awt.*;


/**
*
* @author Brent Dalling
* 
* <h1>Programming Exercise 8-37</h1>
* <p>Guessing Game using states and capitals. </p>
*
*/

class programming_exercise_8_37 {
	public static void main(String[] args) {
		
		// Variables
		Scanner input = new Scanner(System.in);
		String[][] db = {
			{"Utah", "Oregon", "Idaho", "California", "New Mexico", "Colorado", "Montana", "Nebraska", "Kansas", "Washington"}, 
			{"Salt Lake City", "Salem", "Boise", "Sacremento", "Santa Fe", "Denver", "Helena", "Lincoln", "Topeka", "Olympia"}
		};
		String guess;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("What is the capital of " + db[0][i] + "? : ");
			guess = input.nextLine();
			
			if (guess.equalsIgnoreCase(db[1][i])) {
				System.out.println("Correct");
			} else {
				System.out.println("Incorrect");
			}
		}
		
	}
}



