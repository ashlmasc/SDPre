import java.util.Scanner;

public class Objective9Lab4 {
  public static void main(String[] args) {    // Main method
    Scanner kb = new Scanner (System.in);   // Creates a scanner for user input
		double num1, num2;      // Declares double variables num1 and num2

    System.out.print("Please give me a number: ");    // Prompts user for input
		num1 = kb.nextDouble();         // Reads data from user and stores as a variable double named num1
		System.out.print("Please give me another number: ");    // Prompts user for input
		num2 = kb.nextDouble();       // Reads data from user and stores as a variable double named num2

    double average = findAverage(num1, num2);   // Declares double variable average and sets equal to  and calls findAverage method
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);      // Prints out user imputs and average of numbers

    kb.close();   // Closes scanner so program can no longer receive data

  }

  public static double findAverage(double x, double y) {    // findAverage method with data type double
    double avg = (x + y)/2;     // Declares double variable avg and sets equal to equation to solve for average
    return avg;           // Returns the answer of avg expression
  }
}