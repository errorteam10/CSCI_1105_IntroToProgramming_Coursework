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

public class setMethods {
	
	// Setup Formatting
	private static SimpleDateFormat simple = new SimpleDateFormat("MM/dd/yyyy");
	
	
	/**
	 * <h1>time()</h1>
	 * <p>
	 * 	Takes epoch timestamp and sets the class default time to designated epoch time. Useful for applications checking difference in time or future/past values.
	 * </p>
	 * 
	 * @param time (int time; Epoch Value For Class To Reference)
	 */
	public static void time(int time /* Epoch Time value */) {
		
		// Sets Time To Be Used
		epochConverter.time = time;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * <h1>date()</h1>
	 * <p>
	 * 	Takes formatted date string and set's as default to be used within the class. Useful for past/future date projects.
	 * </p>
	 * 
	 * @param time (String time; mm/dd/yyyy formatted date)
	 */
	public static void date(String date) {
		
		// Sets Time To Be Used
		epochConverter.date = date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * <h1>format()</h1>
	 * <p>
	 * 	Takes a format string that the class will use to format outputs. Useful for custom output requirements. 
	 * </p>
	 * 
	 * @param format (String format; mm/dd/yyyy | m d, y format string)
	 */
	public static void format(String format) {
		
		// Sets Time To Be Used
		epochConverter.format = format;
	}
	
	
	
	
	
	
}
