package helloworld;

public class SideEffects {

	public static void main(String[] args) {
		 int i;
		 
		 i=0;
		 
		 
		 /*here, i is still incremented even though the if 
		 statement fails*/
		 if(false & (++i <100))
			 System.out.println("this wont be displayed");
			 System.out.println("if statement executed: " + i);// displays 1
			 
		
			 /* in this case, i is not incremented because
			  * the short-cicuit operator skips the increment. 
			  */
			 if(false && (++i <100))
				 System.out.println("this wont be displayed");
				 System.out.println("if statement executed: " + i);// still 1
				 
			 

	}

}
