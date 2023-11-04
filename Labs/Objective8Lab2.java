public class Objective8Lab2 {
  public static void main(String[] args) {
    int sum = 0;    // Declares integer variable sum and sets equal to 0
    
    for (int i=0; i<=20; i+=1){   // for loop that declares and initializes the integer i to 0, excutes the loop while i is less than or equal to 20, and increases i by 1 increment each time the loop executes
      sum += i;     // Equation that adds the integer i to the sum integer each time the loop executes
    }
      
    System.out.println(sum);    // Print statement that prints the final for loop iteration of the variable sum
  }
}