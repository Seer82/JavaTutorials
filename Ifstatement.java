public class Ifstatement {

	public static void main(String[] args) {

		int num = 11;

		if (num == 10) {
			System.out.println("your number is equal to 10");
		} else if (num < 10) {
			System.out.println("your number is less than 10");

		} else {
			System.out.println("your number must be greater than 10");
			// if none of the above conditional values are true, the output will default to this 
			//else statement
		}

	}

}
