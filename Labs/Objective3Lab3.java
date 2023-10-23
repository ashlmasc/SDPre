public class Objective3Lab3 {
	public static void main (String[] args) {
		int first, second, third, sum;		// declare variables first, second, third, and sum as integers
		first = 1 + (int)(Math.random() * 6);		// initialize variable first as a random number generated between 1 and 6
		second = 1 + (int)(Math.random() * 6);		// initialize variable second as a random number generated between 1 and 6
		third = 1 + (int)(Math.random() * 6);		// initialize variable third as a random number generated between 1 and 6
		sum = first + second + third;		// initializa variable sum as sum if variables first, second, third
		System.out.println(first + " + " + second + " + " + third + " = " + sum);
	}
}