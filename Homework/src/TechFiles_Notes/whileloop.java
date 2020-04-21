package TechFiles_Notes;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		
		
System.out.println("What is my name?");
Scanner userdata = new Scanner (System.in);
String data = userdata.nextLine(); 
	
		while (!data.equalsIgnoreCase("Max")) {
			// adding ! - reverse the sentence. 
			System.out.println("You guessed wrong! Tty again! ");
			
			data=userdata.nextLine();

		}
		
		 System.out.println("You Won!");
	}

}
