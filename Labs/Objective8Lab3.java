public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;    // Declares integer variable counter and intializes to 1

    for (int i=0; i<20; i+=1){   // for loop that declares and initializes the integer i to 0, excutes the loop while i is less than 20, and increases i by 1 increment each time the loop executes

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