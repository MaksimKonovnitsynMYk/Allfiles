package TechFiles_Notes;

import java.util.Scanner;

public class ClassNotesWithAP {

	public static void main(String[] args) {

//			// Difference between the print and printLN
//		System.out.println ( "Hello World");
//
//
//		System.out.print ( "whats going on");
//		System.out.print ( "Is anyone lost");
//		System.out.println("Breaktime?");
//		System.out.println("");
//		System.out.println();
//		
//		// AFTER BREAK NOTES
//		
//		int a = 5; 
//		a = 10; 
//		
//		
//		String b = "Hello";
//		b = "Test";
//		
//		char c = 'c';
//		double A = 5.5; 
//		
//		// Primitive and non-primitive
//		// int - is primitive 
//		// Non Primitive - Referenced data types (Object Type)
//		// float f = 5.55555f; - NEED TO ADD F at the end 
//		
//		
//		
//		// System output. 
//	
//		// 	System.out.println("Test");
//		
//		//Scanner (NAME) = new Scanner (System.in)
//		// Boolean - is either True or False
//		// anything on the left side is the BUCKET - everything on the right side is the value 
//		
//		String fn;
//		String ln;
//		int fnLen; 
//		int lnLen;
//		
//		Scanner userInput = new Scanner (System.in);
//		
//		System.out.println("What is your first name?");
//		fn = userInput.nextLine();
//		System.out.println("What is your Last name?");
//		ln = userInput.nextLine();
//		
//		// fn = userInput.nextLine(); - it will take the whole line
//		//	System.out.print("Hello, ");
//		//	System.out.print(name);
//		
//		// Concart
//		
//		System.out.println("Hello, " + fn + " " + ln);
//		
//		fnLen = fn.length();
//		lnLen = ln.length ();
//		System.out.println("Your first name contains " + fnLen + " Chars." + " Your last name has " + lnLen + " characters");
//		//your first name contains 5 chars. - add pluses 
//		
//	
//		// ChatAt - bring the character from the mentioned location (0 or 1 ot 2 or 3)
//		// in Eclipse will show you the data type after you type "."	
//		System.out.println("Your first character is: " + ln.charAt(0));
//		System.out.println("Your last character is: " + ln.charAt(ln.length ()-1));
//		// Java counts from o (ZERO) to 0, 1, 2, 3, 4,
//		
		
		// to comment all highlighted text - */
		
		
//		System.out.println(5 + 5 +"Hello");
//		System.out.println("Hello " + 5 + 5);
//		System.out.println(5+5);
//		
		String a = "   James Bond    ";
		
//		a.concat (b);
//		System.out.println(	b.concat (a));
//		// Can be used multiple times
//		
	//	System.out.println(a.contains("el"));
		//Contains - will check if text has the specified characters
		
//		System.out.println(a.startsWith("Ja"));
		//System.out.println(a.endsWith("nd"));
		
		//System.out.println(a.equalsIgnoreCase(b));
		// or use when its case sensitive 
	//	System.out.println(a.indexOf("Jam"));
		// finds the character or sequence for you (If doesn't exists - it will type the -1)
	//	System.out.println(a.isEmpty());
		//System.out.println(b.isEmpty());
		
		// TO UPPER CASE
		
//		System.out.println(a.toUpperCase());
	//	a=a.toUpperCase();
//		System.out.println(a.toLowerCase());

	//	System.out.println(a.trim());
		
		
		// REPLACE
		
	//	String x = "Hello world";
	//	System.out.println(	x.replace('o', '$'));
		
		
		// SUBSTRING - takes the location and prints from that place
		
		String x = "Hello world";
	//	System.out.println(	x.replace('o', '$'));
		
	//	System.out.println(	x.substring(3));
	//	System.out.println(	x.subSequence(0, 2)); //  will exclude the last character. One less than you assign 
	
	// ARRAY - multiple values in one variable 
		// THE ARRAY IS [] 
	
		// String[] names = {"James","Tim","Steve"};
		 // Can be written as - String[] names = {"James","Tim","Steve"};
		// System.out.println(names.length);
		 String [] accounts = new String [5]; // - Total of 4 accounts becauyse 0, 1 , 2, 3 ,4 
		 
		 accounts [3] = "A123124123412";
		 char [] indivChar = x.toCharArray();
		 System.out.println(indivChar [0]);
		
	//	 String[] names = {"James","Tim","Steve"}; - if you know the data - you can uise this approach
	//	 int [] data = new int [5]; - this is when you don;t know the information but you know your maximum
	
		 // What does it mean when the string is enumerable - its never created again. This is ONLY ONCE CREATED STRING 
		 
		 String xy = new String ("someValuie");
		 String xy2 = "SomeValue";
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
