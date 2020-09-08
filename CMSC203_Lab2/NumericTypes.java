/*
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner Input= new Scanner (System.in);//Create a Scanner object 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		int temperature=0;//Task #2 declare a variable to hold the user’s temperature
		
		System.out.println("Please input score1:");// prompt user to input score1
		score1=Input.nextInt();						//read score1 
		System.out.println("Please input score2:");// prompt user to input score2
		score2=Input.nextInt();						// read score2 
		
		average = (double)(score1+score2)/NUMBER;  // Find an arithmetic average
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		fToC = ((5*(BOILING_IN_F - 32)/9));// Convert Fahrenheit temperatures to Celsius
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Please input another temperature:");//prompt user to input another temperature
		temperature=Input.nextInt();	// read the user’s temperature in Fahrenheit
		fToC = ((5*((double)temperature - 32)/9));// convert the user’s temperature to Celsius
		output = temperature + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);         //Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

