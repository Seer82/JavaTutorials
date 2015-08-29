package helloworld;

public class LtoD {

	public static void main(String[] args) {
	 
		Long L;
		double D;
		
		
		L =100123285L;
		D=L;//widening conversion, types compatible and 
		//destination is larger than source
		
		System.out.println("L and D: " + L + " " + D);
		
		
	}

}

/*
public class LtoD {

	public static void main(String[] args) {
	 
		Long L;
		double D;
		
		
	    D=100123285.0;
	    L = D; //illegal no automatic conversion from double to long
		
		System.out.println("L and D: " + L + " " + D);
		
		
	}

}










*/