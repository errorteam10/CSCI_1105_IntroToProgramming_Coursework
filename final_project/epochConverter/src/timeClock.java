import java.util.Scanner;

import com.epochConverter.*;

public class timeClock {
	
	// Class wide epoch variable ties to the epochConverter Class.
	private static epochConverter epoch = new epochConverter();
	
	public static void main(String[] args) {
		
		// Set Variables 
		Scanner input = new Scanner(System.in);
		int time = 1555949070;
		int other = 1555603470;
		boolean bool = true;

		timeClock.waiter("EpochConverter Demonstration: We will take you on a guided example of the class. Just follow the prompts!");

		timeClock.waiter("We will 'set' the time being used to '1555949070'. This is an epoch value. An epoch value is the milliseconds elapsed since January 1st, 1970. We can use this number to find multiple dates and times.");

		timeClock.waiter("Below you will see the Time Diff:. The Time Diff is the time mentioned above in epoch, compared to the current system time. \n Time Diff: " + epochConverter.get.timeDiff(time) + "\n You can use the timeDiff method like this : epochconverter.get.timeDiff(1555949070)");

		timeClock.waiter("Below you will see the human date:. The human date is an easy to read date format. \n Human Date: " + epochConverter.get.date(time) + "\n You can use the date method like this : epochconverter.get.date(1555949070)");

		timeClock.waiter("Below you will see the formal date:. The formal date is a standard date format. \n Formal Date: " + epochConverter.get.dateFromTime(time) + " \n You can use the dateFromTime method like this : epochconverter.get.dateFromTime(1555949070)");

		timeClock.waiter("Below you will see the Total Time:. The total time shows you how many years, months, weeks, days, hours, and seconds have passed.  \n Date Counted: " + epochConverter.get.totalTime(time)+"\n You can use the totalTime method like this : epochconverter.get.totalTime(1555949070)");
		
		timeClock.waiter("Next, we will show you how to utilize the setters. Not every application is the same. For this reason, the setters allow you to set the time you are comparing from.");

		timeClock.waiter("To 'set' the current time, you can do epochConverter.set.time(1555949070). This will set the date for that object.");

		timeClock.waiter("To 'set' the current format, you can do epochConverter.set.format(mm/dd/yyyy). This will set the format for that object.");
		
		timeClock.waiter("These setters make it easy to modify the time and formats your application should be using. The class is setup for extensions to be made. Developers can make new methods, formats, setters, getters, and more for their projects. \n Below is real time usage.");
		
		// Display Values Being Tested
		System.out.println("Base Time: " + time);
		System.out.println("Past/Future: " + other);
		
		// Create Space 
		System.out.println("");
		
		// Getters Demonstrations
		System.out.println("Time Diff: " + epochConverter.get.timeDiff(time, other) + "	(First Time: 1555949070 / Second Time: 1555603470)	"); // Get's the difference in time. 
		System.out.println("Human Date: " + epochConverter.get.date(time)); // get's human readable date format
		System.out.println("Formal Date: " + epochConverter.get.dateFromTime(time)); // get's a formal formatted date
		System.out.println("Date Counted: " + epochConverter.get.totalTime(time)); // get's the total of years, months, days, hours, minutes, seconds that have elapsed
		
		// Setters Demonstrations 
		epochConverter.set.time(time); // Set's the class default time.
		epochConverter.set.date("04/22/2019"); // Set's the class default date.
		epochConverter.set.format("mm/dd/yyyy"); // Set's the default format for responses.
		
		System.out.println("\n \n Now can you try this interactively! Go to 'https://www.epochconverter.com/' and get an epoch timestamp. Then select an option below!");
		
		
		while(bool) {
			System.out.print("\n \n [1] Time Diff \n [2] Human Date \n [3] Formal Date \n [4] Total Time \n [5] Exit Application \n \n Selection: ");
			
			switch(input.nextInt()) {
			
			case 1:
				
				System.out.print("Enter Epoch Time: ");
				time = input.nextInt();
				System.out.println("Time Diff: " + epochConverter.get.timeDiff(time) + "\n");
				
				break;
			case 2:
				
				System.out.print("Enter Epoch Time: ");
				time = input.nextInt();
				System.out.println("Human Date: " + epochConverter.get.date(time) + "\n");
				
				break;
			case 3:
				
				System.out.print("Enter Epoch Time: ");
				time = input.nextInt();
				System.out.println("Formal Date: " + epochConverter.get.dateFromTime(time) + "\n");
				
				break;
			case 4: 
				
				System.out.print("Enter Epoch Time: ");
				time = input.nextInt();
				System.out.println("Total Time: " + epochConverter.get.totalTime(time) + "\n");
				
				break;
			case 5:
				
				bool = false;
				
				break;
			default:
				System.out.println("Incorrect Input");
			}
		
		}
		
		System.out.print("Bye Bye.");
		
	}
	
	public static void waiter(String prompt) {
		
		System.out.println(prompt + "\n \n Press Enter To Continue \n ");
		
		boolean bool = false;
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		
	}
}