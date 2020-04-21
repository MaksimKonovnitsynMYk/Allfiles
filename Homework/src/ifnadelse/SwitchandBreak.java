package ifnadelse;

import java.util.Scanner;

public class SwitchandBreak {

	public static void main(String[] args) {
	
		
		System.out.println("What  day of the week is it?");
		Scanner userInput = new Scanner (System.in);
		String day = userInput.nextLine();
		
		
	//	System.out.println("What month is this?");
	//	String month = userInput.nextLine();
		
		switch (day) {
		
		case "Monday": 
			System.out.println("Monday");
		break;
		
		case "Tuesday": 
			System.out.println("Tuesday");
			break;
			
			default:
				System.out.println("Whatever");
		
		}
		
	
			
		}
		
		
		}
		


