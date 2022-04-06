import java.util.*;


public class OddOREven {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
				
	System.out.println("<Odd or Even Identifier>\n");
	
		
		System.out.print("Enter a number:");
		int number = input.nextInt();
		
		if(number % 2 == 0)
			System.out.println("The number is even!");
		else 
			System.out.println("The number is Odd!");
			
	}
	
	
	

}
