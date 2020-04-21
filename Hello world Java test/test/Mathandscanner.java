package test;

import java.util.Scanner;

public class Mathandscanner {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		System.out.println("give your first number");
		int x=in.nextInt ();
		System.out.println("Give your second number");
		int y=in.nextInt ();
		int z=x+y;
		
		System.out.println("Answer is " + z);

	}

}
