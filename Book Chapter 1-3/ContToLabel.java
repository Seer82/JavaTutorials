package helloworld;


//use continue with a label
public class ContToLabel {

	
	public static void main(String[] args) {
		 
		
		outerloop:
			for(int i=1; 1<10;i++){
				System.out.println("\nOuter loop pass " + i + ", Inner Loop: ");
				
				for(int j = 1; j<10; j++){
					if(j ==5) continue outerloop; //continue outerloop
					System.out.println(j);
				}
			}

	}

}
