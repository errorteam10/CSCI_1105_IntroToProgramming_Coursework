/*
* - Brent Dalling
* - March 18th, 2019
*
* - Takes User Input To Determine If palindrome
*/


import java.util.Scanner;

class programming_exercise_6_3 {
	public static void main(String[] args) {
		
		// Defining Variables
		Scanner input = new Scanner(System.in);
		int 	number;
		int 	test;
		int 	reversed;
		boolean result;
		
		// Ask For User Input
		System.out.println("Please Enter Series Of Whole Numbers.");
		
		// Get User Input
		test = input.nextInt();
		
		// Get Reversed
		reversed = reversal(test);

		// Send To Methods
		result = isPalindrome(
		
			// Reversed Number 
			reversed,
			
			// Original Number
			test
		);
		
		// Display To User	
		System.out.println(result ? "Number " + test + " Is A Palindrome" : "Number " + test + " Is Not A Palindrome");
		
	}
	
	// Reverses User Int Input
	public static int reversal(int number) {
		
		// Declare method specific Variables
		int reversalnum = 0;
		
		// Reverse Number
		while(number != 0) {
			
			reversalnum = reversalnum * 10;
			reversalnum = reversalnum + number%10;
			number = number / 10;
			
		}
		
		// Return Reversed Number
		return reversalnum;
	}
	
	// Determines If Palindrome
	public static boolean isPalindrome(int reversed, int original){
		
		// Determine If Match 
		return reversed == original ? true : false;
		
	}
}