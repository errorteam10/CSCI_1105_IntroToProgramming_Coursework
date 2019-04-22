package com.epochConverter;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * <h1>epochConverter()</h1>
 * 
 * <p>
 * 
 * A time utility class that allows the developer to quickly retrieve times from epoch values and format values. The utilities include getter's, setter's, and mutators. Getter's allow the 
 * developer to get values from various methods. Setter's allow the developer to set default information and parameters. Mutator's allow changing formats, converting from time stamp to epoch
 * and so-forth.
 * 
 * </p>
 * 
 * @author Brent Dalling
 *
 */


public class epochConverter {
	
	// Access To Get Methods
	public static getMethods get = new getMethods();
	
	// Access To Set Methods
	public static setMethods set = new setMethods();
	
	// Access To Mutators
	// public static mutator mutator = new mutator();
	
	// Public Variables
	public static int time; // Epoch Time Value
	public static String date; // Date String Value 
	public static String format = "MM/dd/yyyy"; // Format String Value
	
	
	
}
