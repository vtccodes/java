/**
 * Loopy.java
 * Copyright 2018, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

import java.util.Scanner;

/**
 * Loopy - description
 * @author Craig A. Damon
 *
 */
public class Loopy
{

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		/*System.out.println("What number");
		int n = in.nextInt();
		
	
		int fact = 1;
		for (int i = 2; i <= n; i++)
			{
				fact *= i;
			}
		System.out.println(n+"! is "+fact);
		*/
		/*
		String answer;
		System.out.println("tell me yes or no");
    boolean foundAnswer = false;
    do
			{
				answer = in.next();
			  if (answer.equalsIgnoreCase("yes") || 
						answer.equalsIgnoreCase("no"))
					break;
			  //  foundAnswer = true;
			  // else
			  //
				  {
				  	System.out.println("I need yes or no!");
				  }
			}
	  while (true);   // while (!foundAnswer);
		System.out.println("Your answer is "+answer);
		*/
		for (int j = 7; j >= 0; j--)
			{
				for (int i = 0; i < 8; i++)
					{
						if (i == j)
							System.out.print("HH");
						else
							System.out.print("  ");
					}
				System.out.println();
			}
		
		in.close();
	}
}
