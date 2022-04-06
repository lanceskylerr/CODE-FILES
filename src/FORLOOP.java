import java.util.*;

public class FORLOOP {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int counter;
		int num = 0;
		int result = 0;
		
		System.out.print("Enter number of Grading period: ");
		counter = input.nextInt();
		
		if (counter >6) {
			
			System.out.print(" INVALID NUMBER OF GRADING PERIOD!");
			
		}else {
			
			for (int i = 1; i <= counter; i++)
			{
				System.out.print("Enter your Grade: ");
				num = input.nextInt();
				result = result + num;
				
			}
				result = result / counter;
				
				System.out.print("\n--------------------------------------");
				System.out.print("\n\nYour general average is: " + result);
		}
				
	}
	

}
