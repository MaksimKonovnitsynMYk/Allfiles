package test;

import java.util.Calendar;
import java.util.Scanner;

public class CalculatingAge {

	public static void main(String[] args) {

		Scanner xx= new Scanner(System.in);
		
		System.out.println("What is your name");
		String name= xx.next();
		System.out.println("What is your age");
		String age= xx.next();
		
		
		
		
		System.out.println("What year you were born?");
		int year=xx.nextInt();
		Calendar cal = Calendar.getInstance();
		int yearborn = cal.get(Calendar.YEAR);
				int age1=yearborn-year;
	
		System.out.println(name + "you are " + age1 + "years old");
	}

}
