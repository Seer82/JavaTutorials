package helloworld;


// this program contains an error
public class BreakErr {

	public static void main(String[] args) {
	 
		
		one: for(int i=0; i<3;i++){
			System.out.println("Pass " + i + ": ");
		}

	for(int j=0; j < 100; j++){
		//if( j== 10) break one; WRONG
		System.out.println(j + " ");
	}
	}

}

// Since the loop labelled one does not enclose the break statement it is not possible to transfer control to that block