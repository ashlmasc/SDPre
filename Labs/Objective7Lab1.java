public class Objective7Lab1 {
  public static void main(String[] args) {
    int counter = 10;   // Declares and initializes integer variable counter to equal 10

    while(counter > 0) {    // Program checks the condition counter > 0; if condition is met program prints out counter and then subtracts 1 from counter; loop continues running until condition is false and then program exits the loop
      System.out.println(counter);
      counter = counter - 1;    // Equation that subtracts 1 from counter and sets counter to equal new number
    }
  }
}