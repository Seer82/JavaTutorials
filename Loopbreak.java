public class Loopbreak {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 20) {
			System.out.println("looping " + num);
			num++;
			if (num == 15) {
				System.out.println("bum");
			break;
		    // if num == 15 break loop execution
			}

		}

	}
}
