package Homework_All_Classes;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	
 Scanner xx= new Scanner (System.in);
 System.out.println ("Please enter a String!");
 String Answer=xx.next ();
 
 System.out.println(Answer.toUpperCase());
 System.out.println(Answer.length());
 System.out.println(Answer.replace("o", "z"));
 System.out.println(Answer.charAt(Answer.length()-1));
 System.out.println(Answer.concat(" Test"));
 
 
 
 
 
 
 
 
	}

}
