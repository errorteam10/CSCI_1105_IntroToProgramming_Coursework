package com.epochConverter;

import java.util.Date;
import java.text.SimpleDateFormat;



public class epochConverter {
	
	public static getMethods get = new getMethods();
	
	public static String[] all(int time) {
		// all() Variables
		String date 		= getMethods.dateFromTime(time);
		String diff 		= getMethods.timeDiff(time);
		String simple 	= getMethods.totalTime(time);
		String formatted = get.getDate(time);
		
		// Put Results Into Array For Return
		String[] returnData = {date, diff, simple, formatted};
		
		// Return Data		
		return returnData;
	}
}
