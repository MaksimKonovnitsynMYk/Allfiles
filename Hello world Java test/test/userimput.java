package test;

import java.util.Scanner;

public class userimput {

	public static void main(String[] args) {
		
	//  datatype variable= value is which the user is going to type 	
		Scanner sc= new Scanner(System.in);
		System.out.println("what is your name?");
		String x=sc.next();
		System.out.println ("Welcome to the rabbit hole "+x  +", Do you want to continue?");
	}

}
