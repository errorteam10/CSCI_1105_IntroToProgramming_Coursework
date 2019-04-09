package com.epochConverter;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Brent Dalling
 * 
 * <h1>getMethods()</h1>
 * 
 * <p>Used to "Get" values such as current time, date, or get date from epoch.</p>
 *
 */

public class getMethods {
	
	// Setup Formatting
	private static SimpleDateFormat simple = new SimpleDateFormat("MM/dd/yyyy");
	
	
	/**
	 * <h1>dateFromTime()</h1>
	 * @param time (int; The epoch time value to be converted. Must be in milliseconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"mm/dd/yyyy"
	 * 
	 */
	
	public static String dateFromTime(int time) {
		
		// getDateFromTime() Variables 
		Date date = new Date();
		
		String dateFormattedForEase = getDate(time);
		
		System.out.print(dateFormattedForEase);
		
		// Set Date To The Input [time]
		date.setTime((long)time * 1000);
		
		//  Return Default Java Date Object
		return simple.format(date);
	}
	
	
	/**
	 * <h1>dateFromTime()</h1>
	 * @param time (long; The epoch time value to be converted. Must be in milliseconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"mm/dd/yyyy"
	 * 
	 */
	
	public static String dateFromTime(long time /* System.currentTimeMillis()*/) {
		
		// getDateFromTime() Variables
		Date date = new Date();
		
		// Set Date To The Input [time]
		date.setTime((long)time * 1000);
		
		// Return Formatted
		return simple.format(date);
	}
	
	public static String getDate(int time) {
		
		// getTimeDiff() Variables 
		long current 	= System.currentTimeMillis() / 1000;
		long date  	 	= time;
		long conversion = date;
		int years 		= 0;
		int months 		= 0;
		int weeks 	 	= 0;
		int days 	 	= 0;
		int hours 	 	= 0;
		int minutes  	= 0;
		long seconds  	= 0;
		int yearCounter 	= 0;
		int daysCounter 	= 0;
		
		String[] weeklyDays = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novemeber", "December"};
		while (conversion > 31556926) {
			years += 1;
			conversion  -= 31556926;
			
			if(yearCounter == 5) {
				yearCounter = 1;
			} else {
				yearCounter++;
			}
		}
		
		while (conversion > 2629743) {
			months += 1;
			
			if (months == 1 || months == 3 | months == 5 | months == 7 | months == 9 | months == 12) {
				conversion  -= 2678400;
				daysCounter += 31;
			} else if (months == 4 | months == 6 | months == 8 | months == 10) {
				conversion  -= 2592000;
				daysCounter += 30;
			} else if(months == 2 && yearCounter == 4 && (years + 1970) % 4 != 00) {
				conversion -= 2505600;
				daysCounter += 29;
			} else {
				conversion -= 2419200;
				daysCounter += 28;
			}
		}
				
		// While difference is during a week
		while (conversion > 604800) {
			weeks += 1;
			conversion -= 604800;
		}
				
		// While Days Remain
		while (conversion > 86400) {
			days += 1;
			conversion -= 86400;
		}
				
		// While Hours Remain
		while (conversion > 3600) {
			hours += 1;
			conversion -= 3600;
		}
				
		// While Minutes Remain
		while (conversion  > 60) {
			minutes += 1;
			conversion -= 60;
		}
				
		// Left Over Is Total Seconds
		seconds = conversion;
		
		daysCounter = daysCounter / 7;
		
		System.out.println(daysCounter);
		
		if(daysCounter > 7) {
			daysCounter -= 7;
		}
		
		System.out.println(daysCounter);
		
		System.out.println(weeklyDays[daysCounter - 1] + " " + monthNames[months] + " " + days + "th, " + (years + 1970));
		
		return "";
	}
	
	
	/**
	 * <h1>timeDiff()</h1>
	 * @param time (int; The epoch time value to be converted. Must be in seconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"W | H | M | S  Weeks/Hours/Minutes/Seconds Ago."
	 * 
	 */
	
	public static String timeDiff(int time) {
		
		// getTimeDiff() Variables 
		long current = System.currentTimeMillis() / 1000;
		long date  	 = time;
		long conversion = current - date;
		int weeks 	 = 0;
		int days 	 = 0;
		int hours 	 = 0;
		int minutes  = 0;
		long seconds  = 0;
		
		// While difference is during a week
		while (conversion > 604800) {
			weeks += 1;
			conversion -= 604800;
		}
		
		// While Days Remain
		while (conversion > 86400) {
			days += 1;
			conversion -= 86400;
		}
		
		// While Hours Remain
		while (conversion > 3600) {
			hours += 1;
			conversion -= 3600;
		}
		
		// While Minutes Remain
		while (conversion  > 60) {
			minutes += 1;
			conversion -= 60;
		}
		
		// Left Over Is Total Seconds
		seconds = conversion;
		
		// Minutes Is Set But Not Hours
		if(minutes != 0 && hours == 0) {
			return minutes + " Min Ago.";
		} else if (hours != 0 && days == 0) {
			return hours + " Hours Ago.";
		} else if (days != 0 && weeks == 0) {
			return days + " Days Ago.";
		} else if (weeks != 0) {
			return weeks + " Weeks Ago.";
		} else {
			return "Formatting Failed. Possible Duplicate Time.";
		}
		
	}
	
	
	/**
	 * <h1>timeDiff()</h1>
	 * @param time (long; The epoch time value to be converted. Must be in seconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"W | H | M | S  Weeks/Hours/Minutes/Seconds Ago."
	 * 
	 */
	
	public static String timeDiff(long time) {
		
		// getTimeDiff() Variables 
		long current = System.currentTimeMillis() / 1000;
		long date  	 = time;
		long conversion = current - date;
		int weeks 	 = 0;
		int days 	 = 0;
		int hours 	 = 0;
		int minutes  = 0;
		long seconds  = 0;
		
		// While difference is during a week
		while (conversion > 604800) {
			weeks += 1;
			conversion -= 604800;
		}
		
		// While Days Remain
		while (conversion > 86400) {
			days += 1;
			conversion -= 86400;
		}
		
		// While Hours Remain
		while (conversion > 3600) {
			hours += 1;
			conversion -= 3600;
		}
		
		// While Minutes Remain
		while (conversion  > 60) {
			minutes += 1;
			conversion -= 60;
		}
		
		// Left Over Is Total Seconds
		seconds = conversion;
		
		// Minutes Is Set But Not Hours
		if(minutes != 0 && hours == 0) {
			return minutes + " Min Ago.";
		} else if (hours != 0 && days == 0) {
			return hours + " Hours Ago.";
		} else if (days != 0 && weeks == 0) {
			return days + " Days Ago.";
		} else if (weeks != 0) {
			return weeks + " Weeks Ago.";
		} else {
			return "Formatting Failed. Possible Duplicate Time.";
		}
		
	}
	
	
	/**
	 * <h1>totalTime()</h1>
	 * @param time (int; The epoch time value to be converted. Must be in seconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"Years: Months: Weeks: Days: Hours: Seconds: "
	 * 
	 */
	
	public static String totalTime(int time) {
		
		// getTimeDiff() Variables 
		long current 	= System.currentTimeMillis() / 1000;
		long date  	 	= time;
		long conversion = current - date;
		int years 		= 0;
		int months 		= 0;
		int weeks 	 	= 0;
		int days 	 	= 0;
		int hours 	 	= 0;
		int minutes  	= 0;
		long seconds  	= 0;
		
		while (conversion > 31556926) {
			years += 1;
			conversion  -= 31556926;
		}
		
		while (conversion > 2629743) {
			months += 1;
			conversion  -= 2629743;
		}
				
		// While difference is during a week
		while (conversion > 604800) {
			weeks += 1;
			conversion -= 604800;
		}
				
		// While Days Remain
		while (conversion > 86400) {
			days += 1;
			conversion -= 86400;
		}
				
		// While Hours Remain
		while (conversion > 3600) {
			hours += 1;
			conversion -= 3600;
		}
				
		// While Minutes Remain
		while (conversion  > 60) {
			minutes += 1;
			conversion -= 60;
		}
				
		// Left Over Is Total Seconds
		seconds = conversion;
		
		return "Years: " + years + " -- Months: " + months + " -- Weeks: " + weeks + " -- Days: " + days + "  -- Hours: " + hours + " -- Minutes: " + minutes + " -- Seconds: " + seconds;
		 
	}
	
	
	/**
	 * <h1>totalTime()</h1>
	 * @param time (long; The epoch time value to be converted. Must be in seconds.)
	 * @return String
	 * 
	 * {@code}
	 * 	"Years: Months: Weeks: Days: Hours: Seconds: "
	 * 
	 */
	
	
	public static String totalTime(long time) {
		
		// getTimeDiff() Variables 
		long current 	= System.currentTimeMillis() / 1000;
		long date  	 	= time;
		long conversion = current - date;
		int years 		= 0;
		int months 		= 0;
		int weeks 	 	= 0;
		int days 	 	= 0;
		int hours 	 	= 0;
		int minutes  	= 0;
		long seconds  	= 0;
		
		while (conversion > 31556926) {
			years += 1;
			conversion  -= 31556926;
		}
		
		while (conversion > 2629743) {
			months += 1;
			conversion  -= 2629743;
		}
				
		// While difference is during a week
		while (conversion > 604800) {
			weeks += 1;
			conversion -= 604800;
		}
				
		// While Days Remain
		while (conversion > 86400) {
			days += 1;
			conversion -= 86400;
		}
				
		// While Hours Remain
		while (conversion > 3600) {
			hours += 1;
			conversion -= 3600;
		}
				
		// While Minutes Remain
		while (conversion  > 60) {
			minutes += 1;
			conversion -= 60;
		}
				
		// Left Over Is Total Seconds
		seconds = conversion;
		
		return "Years: " + years + " -- Months: " + months + " -- Weeks: " + weeks + " -- Days: " + days + "  -- Hours: " + hours + " -- Minutes: " + minutes + " -- Seconds: " + seconds;
		 
	}
	
}
