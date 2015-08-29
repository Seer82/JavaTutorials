package helloworld;

public class Empty2 {

	public static void main(String[] args) {
	  int i;
	  
	  i =0; //move initialisation out of loop
	  for(;i<10;){
		  System.out.println("pass#" + i);
		  i++;//increment loop control variable
	  }

	}

}

 