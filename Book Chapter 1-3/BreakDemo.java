package helloworld;



//using break to exit a loop
public class BreakDemo {

	public static void main(String[] args) {
		
		int num;
		num = 100;
		
		//loop while i-squared is less than num
		for(int i=0; i< num; i++){
			int sqr = i*i;
			if(sqr >=num) break; //terminate loop if i*i >=100
			System.out.println(sqr + " ");
			
			
			
		}
		System.out.println("loop complete.");

	}

}
