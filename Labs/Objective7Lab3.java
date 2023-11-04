public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter < 20) {    // Program checks the condition counter < 20; if condition is met program runs if/else statement and then adds 1 to counter; loop continues running until condition is false and then program exits the loop
      
        if(counter % 2 == 0){  // if statement determines if a number is even and prints out statement if condition is met
          System.out.println(counter + " is even");
        }

        else {    // else statement executes if if-statement condition is not met and prints out statement
          System.out.println(counter + " is odd");
        }

      counter = counter + 1;    // Equation that adds 1 to counter and sets counter to equal new number
    }
  }
}