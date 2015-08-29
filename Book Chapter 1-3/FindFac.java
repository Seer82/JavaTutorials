package helloworld;

/* use nested loops to find factors of numbers between 2 and 100 */

public class FindFac {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(i=2; i <=100;i++){
			System.out.println("Factors of " + i + ": ");
			for(j =2; j<i; j++)
				if((i%j) == 0) System.out.println(j + " ");
			System.out.println();
				
			
			
		}
		
		 
	}

}
