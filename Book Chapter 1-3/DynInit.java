package helloworld;



//Demonstrate Dynamic Initialisation 
public class DynInit {

	public static void main(String[] args) {
		 double radius = 4, height =5;// Initialised with constants 
		 
		 // dynamically initialise volume
		 double volume = 3.1416 * radius * radius * height;
		 
		 System.out.println("volume is " + volume);

	}

}
