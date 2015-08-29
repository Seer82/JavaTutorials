package helloworld;



//read a character from a keyboard
public class KeyboardIn {

	public static void main(String[] args) 
		throws java.io.IOException {
			
			char ch;
			System.out.println("Press a key followed by enter:");
			
			ch =(char) System.in.read(); //get a char
			
			System.out.println("Your key is: " + ch);
			
			
			
			
		}
		 

	}


