package helloworld;


//Demonstrate casting, narrowing conversion
public class CastDemo {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y =3.0;
		
		i = (int) (x/y); //cast double to int
		System.out.println("Interger outcome of x/y:  " + i);
		
		
		i =100;
		b = (byte) i;// no loss of information here byte can hold the value 100
		System.out.println("value of b: " + b);
		
		i = 257;
		b = (byte) i;//information loss this time byte cannot hold this value
		System.out.println("value of b: " + b);
		
		b = 88; //ASCII value for X
		ch = (char) b;// cast between incompatible types
		System.out.println("ch: " + ch);

	}

}
