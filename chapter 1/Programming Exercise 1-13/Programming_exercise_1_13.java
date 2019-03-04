/*
* - Brent Dalling
* - March 25th, 2019
*
* - Computes An Equation And Displays The Console
*/


class Untitled {
	public static void main(String[] args) {
	
		/*
		
			3.4x + 50.2y = 44.5
		 	2.1x + 0.55y = 5.9
			
			| 3.4 | 50.2 |
			| 2.1 | 0.55 |
			
			3.4 * 0.55
			2.1 * 50.2
			
		*/
		
		double a = (3.4 * 0.55);
		double b = (2.1 * 50.2);
		double d = a - b;
		//System.out.println(d);
		
		
		/*
		
			3.4x + 50.2y = 44.5
		 	2.1x + 0.55y = 5.9
		
			| 44.5 | 50.2 |
			| 5.9  | 0.55 |
			
			44.5 * 0.55
			5.9  * 50.2
			
		*/
		
		double x1 = (44.5 * 0.55);
		double x2 = (5.9  * 50.2);
		double dx = x1 - x2;
		//System.out.println(dx);
		
		
		/*
		
			3.4x + 50.2y = 44.5
		 	2.1x + 0.55y = 5.9
		
			| 44.5 | 3.4 |
			| 5.9  | 2.1 |
			
			44.5 * 2.1
			5.9  * 3.4
			
		*/
		
		double y1 = (44.5 * 2.1);
		double y2 = (5.9  * 3.4);
		double dy = y1 - y2;
		//System.out.println(dy);
		
		
		/*
		
				dx
			x = --
				d
				
				dy
			y = --
				d
			
		*/
		double x = (dx / d);
		double y = (dy / d);
		
		// Display Results To Console
		System.out.println(
			"(x, y) = (" + Double.toString(x) + ", " + Double.toString(y) + ")"
		);
		
	}
}