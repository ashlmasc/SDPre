import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);    // Creates a scanner for user input
      int userInput;    // Declares variable integer userInput

      System.out.println("Please enter a number: ");    // Prompts user for input
      userInput = scanner.nextInt();    // Reads data from user and stores as a variable integer named userInput

      if(userInput % 2 == 0){  // if statement determines if a number is even and prints out statement if condition is met
         System.out.println("The number is even");
      }

      else {    // else statement executes if if-statement condition is not met and prints out statement
        System.out.println("The number is odd");  
      }

    scanner.close();    // Closes scanner so program can no longer receive data

    }
  }