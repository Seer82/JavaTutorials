package helloworld;

public class GuessingGame2 {

	public static void main(String[] args) 
	throws java.io.IOException{
		
		char ch, answer = 'k';
		
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
		
		ch = (char) System.in.read(); //get a char
		
		if(ch== answer) System.out.println("**Right**");
		else{ System.out.println(".... Sorry you are wrong, try again!");
		if(ch < answer) System.out.println("guess too low");
		else System.out.println("guess too high");
		
		}
		
		
		

	}

}
