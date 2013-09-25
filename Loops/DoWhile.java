import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int value = 0;
		// int is a global variable declared outside of loop, as it is used by
		// the while statement as well

		do {
			System.out.println("enter a number: ");
			value = input.nextInt();
			// execute loop while the value is not equal to 5
		} while (value != 5);

		System.out.println("congratulations you entered the right number");

		// if condition is 5 print this

	}
}
