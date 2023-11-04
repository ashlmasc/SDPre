import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    int num1 = 0, num2 = 0, num3 = 0;   // Declares and initializes integer variabls num1, num2, num3 to 0
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;    // Declares and initializes double variables dub1, dub2, dub3 to 0.0

    Scanner keyboard = new Scanner(System.in); //Creates a scanner for user input

    System.out.println("Please enter the first whole number you would like to add."); // Prompts user for input
    num1 = keyboard.nextInt();   // Reads data from user and stores it as integer variable num1

    System.out.println("Please enter the second whole number you would like to add.");    // Prompts user for input
    num2 = keyboard.nextInt();         // Reads data from user and stores it as integer variable num2

    System.out.println("Please enter the third whole number you would like to add.");    // Prompts user for input
    num3 = keyboard.nextInt();    // Reads data from user and stores it as integer variable num3

    System.out.println("Please enter the first decimal number you would like to add.");    // Prompts user for input
    dub1 = keyboard.nextDouble();      // Reads data from user and stores it as double variable dub1

    System.out.println("Please enter the second decimal number you would like to add.");    // Prompts user for input
    dub2 = keyboard.nextDouble();        // Reads data from user and stores it as double variable dub2

    System.out.println("Please enter the third decimal number you would like to add.");    // Prompts user for input
    dub3 = keyboard.nextDouble();        // Reads data from user and stores it as double variable dub3

    int sumNum = num1 + num2 + num3;            // Initializes integer variable sumNum and sets equal to sum of num1 + num2 + num3
    double sumDub = dub1 + dub2 + dub3;         // Initializes double variable SumDub and sets equal to sum of dub1 + dub2 + dub3

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3  + " = " + sumNum);      // Uses user input and prints out as required 
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3  + " = " + sumDub);      // Uses user input and prints out as required

    keyboard.close();    // Closes scanner so program can no longer receive data
  }
}