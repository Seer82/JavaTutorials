package helloworld;

/*This program attempts to declare a variable in an inner
 * scope with the same name as the one defined in the outer scope
this program will not compile

 */

/*

public class NestVar {

	public static void main(String[] args) {
		int count;
		
		for(count =0;count <10;count++){
			System.out.println("this is count: " + count);
			
			
			int count;//illegal
			for(count = 0;count <2;count++)
				System.out.println("this program is in error");
			
		}
			
		 

	}

}

*/