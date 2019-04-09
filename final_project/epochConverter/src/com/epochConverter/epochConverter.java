package com.epochConverter;

import java.util.Date;
import java.text.SimpleDateFormat;



public class epochConverter {
	
	public getMethods get = new getMethods();
	
	public static String[] all(int time) {
		// all() Variables
		String date 		= getMethods.dateFromTime(time);
		String diff 		= getMethods.timeDiff(time);
		String simple 	= getMethods.totalTime(time);
		
		// Put Results Into Array For Return
		String[] returnData = {date, diff, simple};
		
		// Return Data		
		return returnData;
	}
}
