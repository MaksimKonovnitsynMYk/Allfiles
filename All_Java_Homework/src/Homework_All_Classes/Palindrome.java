package Homework_All_Classes;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		String originalInput, reverseInput ="";
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please provide a string");
		
		originalInput = userInput.nextLine();
		int length = originalInput.length();
		for (int i = length-1; i>=0; i --) {
			reverseInput = reverseInput + originalInput.charAt(i);
	}
		if (originalInput.equals(reverseInput)) {
			System.out.println(originalInput + "is a palindrome");
		}

	else
	{
	System.out.println(originalInput + " is not a palindrome");
	}
}
}