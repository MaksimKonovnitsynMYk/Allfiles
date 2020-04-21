package Homework_All_Classes;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		
//
//Scanner calculator = new Scanner (System.in);
//		System.out.println("Provide First Value");
//		int A = calculator.nextInt();
//		System.out.println("Provide Second Value");
//		int B = calculator.nextInt();
//		System.out.println("Choose operation - ADD, SUB, MULTI, DIV");
//		String name = calculator.nextLine();
//		String operation = calculator.nextLine();
//		
//		if(operation.equalsIgnoreCase("Add")) {
//			System.out.println("Your answer " + (A + B));
//		}
//		
//	else if (operation.equalsIgnoreCase("SUB")) {
//			System.out.println("Your answer " + (A - B));
//		
//		}
//
//	else if (operation.equalsIgnoreCase("MULTI")) {
//		System.out.println("Your answer " + (A * B));
//	
//	}
//		
//		
//	else if (operation.equalsIgnoreCase("DIV")) {
//		System.out.println("Your answer " + (A / B));
//
//	}
//	}
//}

		Addition ();
		Substract ();
		Multiply ();
		Devide ();
}
	
	static void Addition () {
		Scanner calculator = new Scanner (System.in);
		System.out.println("Provide First Value");
		int A = calculator.nextInt();
		System.out.println("Provide Second Value");
		int B = calculator.nextInt();
		System.out.println("Choose operation - ADD, SUB, MULTI, DIV");
		String name = calculator.nextLine();
		String operation = calculator.nextLine();
		if(operation.equalsIgnoreCase("Add")) 
			System.out.println("Your answer " + (A + B));

		
		
		
		
	}
		static void Substract () {
			Scanner calculator = new Scanner (System.in);
			System.out.println("Provide First Value");
			int A = calculator.nextInt();
			System.out.println("Provide Second Value");
			int B = calculator.nextInt();
			System.out.println("Choose operation - ADD, SUB, MULTI, DIV");
			String name = calculator.nextLine();
			String operation = calculator.nextLine();
			if (operation.equalsIgnoreCase("SUB")) {
				System.out.println("Your answer " + (A - B));
			}
		}
			
			static void Multiply () {	
				Scanner calculator = new Scanner (System.in);
				System.out.println("Provide First Value");
				int A = calculator.nextInt();
				System.out.println("Provide Second Value");
				int B = calculator.nextInt();
				System.out.println("Choose operation - ADD, SUB, MULTI, DIV");
				String name = calculator.nextLine();
				String operation = calculator.nextLine();
					if (operation.equalsIgnoreCase("MULTI")) {
						System.out.println("Your answer " + (A * B));
			}
				
}
				
				static void Devide () {	
					Scanner calculator = new Scanner (System.in);
					System.out.println("Provide First Value");
					int A = calculator.nextInt();
					System.out.println("Provide Second Value");
					int B = calculator.nextInt();
					System.out.println("Choose operation - ADD, SUB, MULTI, DIV");
					String name = calculator.nextLine();
					String operation = calculator.nextLine();
					if (operation.equalsIgnoreCase("DIV")) {
						System.out.println("Your answer " + (A / B));
					
					
					
					
				}
				
}
		}




