package helloworld;

import java.io.IOException;

public class Input1 {

	public static void main(String[] args) throws IOException {
	 
		int sum = 0;
		char ch;
		
		
		do{
			ch= (char) System.in.read();
			if(ch == ' ') sum++;
			
		}while(ch !='.');

      System.out.println("spaces: " + sum);
	}

}
