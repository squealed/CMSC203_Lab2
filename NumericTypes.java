
import java.util.Scanner;
/**
This program demonstrates how numeric types and operators behave in Java
*/
/**
This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner sc = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double usertemp;
		//Task #2 prompt user to input score1
		System.out.println("Enter Score1: ");
		//Task #2 read score1 
		int userscore1 = sc.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Enter Score2: ");
		//Task #2 read score2 
		int userscore2 = sc.nextInt();
		// Find an arithmetic average
		double useraverage = ((double)userscore1+(double)userscore2) / NUMBER;
		System.out.println("Your average was: " + useraverage);
		average = ((double)score1 + (double)score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (((double)BOILING_IN_F - 32) * 5/9);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Enter Another temperature in Fahrenheit: ");
		//Task #2 read the user’s temperature in Fahrenheit
		double usertemp1 = sc.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		usertemp1 = (usertemp1 - 32) * 5/9;
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Your Temperature in Celsius: "+ usertemp1);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}


