import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);    // Creates a scanner for user input
      int userNum;

      System.out.println("Please enter a number: ");    // Prompts user for input
      userNum = scanner.nextInt();    // Reads data from user and stores as a variable integer named userNum

      if(userNum > 0) {     // if statement compares userNum to 0 and if greater than 0 prints out statement
        System.out.println("The number is positive");       // Prints out statement "The number is positive"
      }
      else {    // else statement executes if if statement condition is not met and prints out statement
        System.out.println("The number not positive");    // Prints out statement "The number is not positive"
      }
      
      scanner.close();    // Closes scanner so program can no longer receive data
  }
}