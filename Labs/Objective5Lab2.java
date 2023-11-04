public class Objective5Lab2 {
  public static void main(String[] args) {
    String string1 = "Banana";    // Declares and intializes string variable string1 as Banana
    String string2 = "Bacon";   // Declares and intializes string variable string2 as Bacon
    String string3 = "Banana";    // Declares and intializes string variable string3 as Banana

    if(string1.equals(string2)) {     // if statement compares string1 and string2 and prints statement if string1 equals string2
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {    // else statement runs if string1 does not equal string2 and prints out statement
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    if(string1.equals(string3)) {   // if statement compares string1 and string3 and prints statement if string1 equals string3
      System.out.println(string1 + " is equivalent to " + string3);
    }
    else {    // else statement runs if string1 does not equal string3 and prints out statement
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}