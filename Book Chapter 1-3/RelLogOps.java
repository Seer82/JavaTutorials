package helloworld;

public class RelLogOps {

	public static void main(String[] args) {
	 int i, j;
	 boolean b1, b2;
	 
	 
	 i = 10;
	 j = 11;
if( i < j)System.out.println("i < j");
if(i <= j )System.out.println("i <= j" );
if(i != j)System.out.println("i !=j");
if(i==j)System.out.println("wont execute");
if(i >= j)System.out.println("wont execute");
if(i > j)System.out.println("thus wont execute");


b1 = true;
b2 = false;
if(b1 & b2)System.out.println("this wont execute, b2 is false");
if(! (b1&b2))System.out.println("!(b1 & b2) is true");
if(b2 | b2)System.out.println("b1 | b2 is true");
if(b1 ^ b2)System.out.println("b1 ^ b2 is true");

	}

}
