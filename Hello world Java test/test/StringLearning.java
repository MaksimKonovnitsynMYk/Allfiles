package test;

import java.util.Scanner;

public class StringLearning {

	public static void main(String[] args) {
	//	String str="Tom made myspace";
	//	String age="Rom was 35 years old that time";
	//	String salary="";
	//	System.out.println(str.lenght());
	//	String upper = str.toUpperCase ();
	//	System.out.println(upper);
	//	System.out.println(str.toLowerCase());		
	//	System.out.println(str.trim());	
	//	System.out.println(str.concat(age));
	//	System.out.println(str.contains("Tom"));
	//  System.out.println(str.startsWith("T"));
	//	System.out.println(age.endsWith("time"));
	//	System.out.println(str.replace("Tom", "Mark"));
	// System.out.println(salary.isEmpty());
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name=sc.next();
		System.out.println ("How old are you?");
		String age=sc.next();
		System.out.println("Hello" + name);
		System.out.println("your age is" + age);
		
		
		
		
		
	}

}
