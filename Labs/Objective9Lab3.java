import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {    //Main method
    Scanner scanner = new Scanner(System.in);   // Creates a scanner for user input
    int selection;    // declares integer variable selection

    while(true){

      printMenu();    //Calls printMenu method

      selection = scanner.nextInt();    // Prompts user for input

      if (selection == 1){    // if statment runs if condidtion is met; if user types 1 the system prints out "Hello Human"
        System.out.println("Hello Human");
      }

      else if (selection == 2){   // else-if statement runs if first if statement condition is not met; if user types 2, the system prints out list of favorite foods
        System.out.println("Apples, Bananas, Coconuts");
      }

      else if (selection == 3){   // else-if statement runs if above condidtional statements are false; if user type 3, the system prints out "Goodbye" and exits loop
        System.out.println("Goodbye");
        break;
      }
      
    }

    scanner.close();    // Closes scanner so program can no longer receive data

  }

  public static void printMenu() {    // printMenu method
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}