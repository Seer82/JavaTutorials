package helloworld;

public class GaltoLit {

	public static void main(String[] args) {
		 double gallons, litres;
		 int counter;
		 
		 counter = 0;
		 for(gallons =1; gallons <=100; gallons++){
			 litres = gallons * 3.7854; // convert to litres
			 System.out.println(gallons + " gallons is  " + litres + " litres.");
			 
		 
		 
		 counter++;
		 //every 10th line, print a black line
		 if(counter == 10){
			 System.out.println();
			 counter = 0;
		 }
	}

}

}