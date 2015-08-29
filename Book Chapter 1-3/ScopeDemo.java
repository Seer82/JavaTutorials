package helloworld;

public class ScopeDemo {

	public static void main(String[] args) {

		int x = 10;
		if(x==10) { //start new scope

        int y = 20; // known only to this code block
        // x and y both known here
			
        System.out.println("x and y: " + x + " " + y);
        x = y * 2;
	}
//y = 100; //error y is not known within the scope of this code block


// x is still known here
	 System.out.println("x is " + x);
	
}
}