package helloworld;


//truth table for logical operators
public class LogicalOpTable {

	public static void main(String[] args) {
		
	boolean p, q;
    
	int a, b;
	
	if(p=true){a=0;}else
	{a=1;}
	 
	if(q=true){b=0;}else
	{b=1;}	
	
	
	 
		
	System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
	
	p = true; q = true;
	System.out.println(a + "\t" + q +"\t");
	System.out.println((a&b) + "\t" + (a|b) + "\t");
	System.out.println((a^b) + "\t" + (!p));
	
	p = true; q = false;
	System.out.println(p + "\t" + q +"\t");
	System.out.println((p&q) + "\t" + (p|q) + "\t");
	System.out.println((p^q) + "\t" + (!p));
	
	p = false; q = true;
	System.out.println(p + "\t" + q +"\t");
	System.out.println((p&q) + "\t" + (p|q) + "\t");
	System.out.println((p^q) + "\t" + (!p));
	
	p = false; q = false;
	System.out.println(p + "\t" + q +"\t");
	System.out.println((p&q) + "\t" + (p|q) + "\t");
	System.out.println((p^q) + "\t" + (!p));
	
	
	
	
	
	
	 

	}

}
