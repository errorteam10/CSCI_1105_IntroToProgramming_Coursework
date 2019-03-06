
/*
* - Brent Dalling
* - March 6th, 2019
*
* - Some special string magic
*/

import java.util.Scanner;

class programming_exercise_5_49 {
	public static void main(String[] args) {
		
		// Define Variables
		Scanner user = new Scanner(System.in);
		String query;
		String check;
		int vowels = 0;
		int consonants = 0;
		
		// Get User Input
		System.out.print("Type A Sentence: ");
		query = user.nextLine();
				
		// Iterate Through The Strings Characters
		for(int i = 0; i < query.length(); i++) {
			
			// Specify Character To Check 
			check = query.toLowerCase();
			
			// Determine If 
			if(check.charAt(i) == 'a' || check.charAt(i) == 'e' || check.charAt(i) == 'i' || check.charAt(i) == 'o' || check.charAt(i) == 'u') {
				
				// Add Vowel
				vowels++;
			} else {
				
				// Add consonants
				consonants++;
			}
			
		}
		
		// Start Display To User
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		
	}
}