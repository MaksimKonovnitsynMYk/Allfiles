package ifnadelse;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
	
		
		
		
		System.out.println("What day of the week is it?");
		Scanner userInput = new Scanner (System.in);
		String day = userInput.nextLine();
		
		
		System.out.println("What month is this?");
		String month = userInput.nextLine();
		
		
		
		if (month.equalsIgnoreCase("December") && day.equalsIgnoreCase("Saturday")) {
			System.out.println("Class time");
		
			
			
		}
		
		else if (day.equalsIgnoreCase("Sunday")){
			System.out.println("Break");
			
			
		}
		else if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")){
			System.out.println("Work");
			
			// || - pipe is represent OR 
			// && - represents BOTH
			
			//else if (day.equalsIgnoreCase("Monday") && day.equalsIgnoreCase("Tuesday")){
			//	System.out.println("Work");
		}
		else {
			System.out.println("work");
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
