public class Objective6Lab1 {
  public static void main(String[] args) {
    int month = 6;    // Declares and intializes integer variable month to 6

    switch (month) {    // Switch statement compares the integer variable month and executes the case the matches the integer value 6
      case 1:
        System.out.println("January");
        break;

      case 2:
        System.out.println("February");
        break;

      case 3:
        System.out.println("March");
        break;

      case 4:
        System.out.println("April");
        break;

      case 5:
        System.out.println("May");
        break;

      case 6:
        System.out.println("June");   // Case 6 is met because the integer month equals 6 so "June" will print out
        break;

      case 7:
        System.out.println("July");
        break;

      case 8:
        System.out.println("August");
        break;

      case 9:
        System.out.println("September");
        break;

      case 10:
        System.out.println("October");
        break;

      case 11:
        System.out.println("November");
        break;

      case 12:
        System.out.println("December");
        break;

      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}