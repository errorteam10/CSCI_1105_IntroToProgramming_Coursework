class programming_exercise_5_11 {
	public static void main(String[] args) {			
		
		// Define Variables
		int counter = 0;
		
		// Iterate From 100 --- 200
		for(int i = 100; i < 200; i++ ) {
			
			// Determine If divisible by 5 or 6 but not both
			if(i % 5 == 0 ^ i % 6 == 0) {
				
				// Check Counter To Determine Placement
				if(counter == 9) {
					
					// Display To User But New Line
					System.out.printf(i + " \n");
					 
					// Set Counter To 1 So We Can Count Again.
					counter = -1;
				} else {
					
					// Display To User
					System.out.print(i + "	");
				}
				
				// Add 1 To Counter
				counter++;
			}
		}
	}
}