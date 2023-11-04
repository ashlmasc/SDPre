import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear = 0, age, currentYear = 2023; // Declares variable birthYear and initializes to 0; declares variable currentYear and initializes to 2023

    Scanner input = new Scanner(System.in);  // Creates a scanner for user input

    System.out.println("How old are you?"); // Prompts user for input
    age = input.nextInt();        // Reads data from user and stores as a variable integer named age

    birthYear = currentYear - age;      // Equation that solves the year the user was born given age and current year

    System.out.println("You were born in " + birthYear);  // Prints out year user was born

    input.close();    // Closes scanner so program can no longer receive data
  }
}