import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);    // Creates a scanner for user input

    System.out.println("What is your first name?"); // Prompts user for input
    String fname = keyboard.nextLine();   // Reads data from user and stores it as string variable fname

    System.out.println("What is your last name?");    // Prompts user for input
    String lname = keyboard.nextLine();         // Reads data from user and stores it as string variable lname

    System.out.println("What is your favorite animal?");    // Prompts user for input
    String favoriteAnimal = keyboard.nextLine();    // Reads data from user and stores it as string variable favoriteAnimal

    System.out.println("What is your favorite food?");    // Prompts user for input
    String favoriteFood = keyboard.nextLine();      // Reads data from user and stores it as string variable favoriteFood

    System.out.println("What is your favorite song?");    // Prompts user for input
    String favoriteSong = keyboard.nextLine();        // Reads data from user and stores it as string variable favoriteFood

    System.out.println("My name is " + fname + " " + lname + ".");      // Uses user input and prints out as required 
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");    // Uses user input and prints out as required
    System.out.println("My favorite food is " + favoriteFood + ".");        // Uses user input and prints out as required
    System.out.println("My favorite song is " + favoriteSong + ".");    // Uses user input and prints out as required

    keyboard.close();    // Closes scanner so program can no longer receive data
  }
}