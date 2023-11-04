public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 1;    // Declares integer variable count and initializes to 1
    int sum = count;    // Declares integer variable sum and sets equal to count

    while(count < 20) {    // Program checks the condition count < 20; if condition is met program adds 1 to count and adds up all count numbers to get sum; loop continues running until condition is false and then program exits the loop
      
      count = count + 1;    // Equation that adds 1 to count and sets count to equal new number
      sum = sum + count;    // Equation that adds integer variables sum and count together and sets equal to new sum number
       
    }

   System.out.println(sum);   // System prints out statement of the final sum of the count when the while loop ends

  }
}