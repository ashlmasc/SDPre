public class Objective5Lab1 {
  public static void main(String[] args) {
    int num1 = 5;   // Declares integer variable num1 and initializes to 5
    int num2 = 15;    // Decalares integer variable num2 and initializes to 15

    if(num1 > num2) {   // If statement compares num1 and num2 and if statement is true, prints out num1 is greater than num2; if false program goes to elseif statement
      System.out.println(num1 + " is greater than " + num2);  

    }
    else if(num2 > num1) {    // else if statement runs only if the above if statement is false; if elseif statement is true, prints out num2 is greater than num1
      System.out.println(num2 + " is greater than " + num1);

    }
  }
}