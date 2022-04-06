import java.util.*;

public class PRACTICE1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] lols) {
		
		String YorNo;
		int n1, n2, n3;
		
		do {

			System.out.println("Input three numbers");

			System.out.print("1st Number: ");
			n1 = input.nextInt();
			input.nextLine();
			
			System.out.print("2nd Number: ");
			n2 = input.nextInt();
			input.nextLine();
			
			System.out.print("3rd Number: ");
			n3 = input.nextInt();
			input.nextLine();
			
			System.out.println("=====================");

			System.out.println(n1 + "," + n2 + "," + n3);

			if (n1 > n2 && n1 > n3) {
				System.out.println("The highest number is: " + n1);

			} else if (n2 > n1 && n2 > n3) {
				System.out.println("The highest number is: " + n2);

			} else {
				System.out.println("The highest number is: " + n3);
			}
			
			System.out.println("=====================");

			System.out.println("Do it again? [Y] or [N]");
			System.out.print("ANS: ");
			YorNo = input.nextLine();
			
		} while (YorNo.equalsIgnoreCase("Y"));
		
	System.out.println("\nTHANK U TANGINAMO");
		
	}
}
