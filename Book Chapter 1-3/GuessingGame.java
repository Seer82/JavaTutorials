package helloworld;

public class GuessingGame {

	public static void main(String[] args) 
	
	throws java.io.IOException{
		
		char ch, answer = 'k';
		
		System.out.println("I'm thinking of a letter between A and Z.");
System.out.print("Can you guess it?: ");


ch =(char) System.in.read(); //read a char from the leybpard

if(ch == answer) System.out.println("congratulations, you are correct!");
else System.out.println("...Sorry try again!" );
		
		
		

	}

}
