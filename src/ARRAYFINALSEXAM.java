import java.util.*;

public class ARRAYFINALSEXAM {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] tenths = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninenty" };

		System.out.print("Enter a number: ");
		String num = input.nextLine();

		if (Integer.parseInt(num) == 0) {
			System.out.println("zero");
		} else if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > 99) {
			System.out.println("Invalid Entry");
		} else {
			
			if (Integer.parseInt(num) >= 0 && Integer.parseInt(num) <= 19) {
				
				System.out.println(ones[Integer.parseInt(num)]);
				
			} else if (Integer.parseInt(num) >= 20 && Integer.parseInt(num) <= 99) {
				
				System.out.println(tenths[Integer.parseInt(String.valueOf(num.charAt(0))) - 2] + " "
						
						+ ones[Integer.parseInt(String.valueOf(num.charAt(1)))]);
			}
		}
	}

}
