import java.util.*;

public class PRACTICE2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] lmao) {

		double result, FixSal, Sales, TotalInc;
		String name, YorNo;

		System.out.println("========== Good day employee!==========");
		do {
			System.out.print("\nName: ");
			name = input.nextLine();

			System.out.print("Fixed Salary: ");
			FixSal = input.nextDouble();
			input.nextLine();

			System.out.print("Sales: ");
			Sales = input.nextDouble();
			input.nextLine();

			System.out.println("\n====================");

			System.out.println("\nName: " + name);
			result = FixSal + Sales * .15;

			System.out.println("Your total Income is: " + String.format("%,.2f", +result));

			if (result < 10000) {
				System.out.println("Tanginamo balik trabaho!");

			} else if (result >= 10000) {
				System.out.println("Congrats! Panalo ka kay bossing!");
			}

			System.out.println("\nGusto mo isa pa? [Y] or [N]");
				System.out.print("Y or N: ");
				YorNo = input.nextLine();

		} while (YorNo.equalsIgnoreCase("Y"));
				System.out.println("\nThank u balik ka ulet!");
	}

}
