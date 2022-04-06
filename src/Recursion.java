import java.util.*;

public class Recursion {

	static int total;
	static Scanner input = new Scanner(System.in);



	public static void main(String[] args) {
		
		System.out.print("Enter a number of recursion = ");
		int usernum = input.nextInt();
		
	
		for (int i = 0; i <= usernum-1; i++) {
			int num = Sum(i);
			System.out.println(" " + num);
			total = total + num;
		}
		System.out.println("\nOutput is: " + total);
	}

	public static int Sum(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Sum(n - 2) + Sum(n - 1);
	
	}
}