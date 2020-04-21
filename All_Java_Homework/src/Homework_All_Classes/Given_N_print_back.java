package Homework_All_Classes;

import java.util.Scanner;

public class Given_N_print_back {

	public static void main(String[] args) {
		Scanner givenNumber = new Scanner (System.in);
		System.out.println("Please provide any number");
		int N = givenNumber.nextInt();
		for (int i = N; i >=0; i--)
		System.out.println(i + "");
	
	
	}

}
