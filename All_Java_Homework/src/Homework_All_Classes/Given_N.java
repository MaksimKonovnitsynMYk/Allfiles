package Homework_All_Classes;

import java.util.Scanner;

public class Given_N {

	public static void main(String[] args) {
		// Given N --- Print this pattern up to N: 1, 4, 8, 12, 16…
		Scanner givenNumber = new Scanner (System.in);
		System.out.println("Please provide the number");
				int N = givenNumber.nextInt();
		
		for (int i=0; i<=N; i++)
		{
			if (i==0)
			{
			System.out.println("1, ");
		}
			else if (i> N/4)
			{
				break;
			}
			else {
				System.out.println(i*4 + ", ");
			}
		
		
		
		
		
		
		
		
		
	}

}
}
