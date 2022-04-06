import java.util.*;

public class MIDTERMEXAM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String chooseitem, Pencil, Notebook, Eraser;
		double quantity, total, cash, change;
	

		do {

			System.out.print("=========================");
			System.out.println("\nA Pencil costs  : 20.00");
			System.out.println("A Notebook costs: 40.00");
			System.out.println("An Eraser costs : 10.00");
			System.out.print("=========================");

			System.out.println("\n\nWhat would you like? [1] Pencil, [2]Notebook, [3]Eraser");
			System.out.print("Enter item no. here: ");
			chooseitem = input.nextLine();

			if (chooseitem.equals("1")) {

				System.out.println("\nItem code    : 1");
				System.out.println("Description  : Pencil = 20");
				System.out.print("Quantity     : ");
				quantity = input.nextInt();
				input.nextLine();
				total = quantity * 20;
				System.out.println("Total Amount : " + String.format("%,.2f", total));
				System.out.print("=========================");
				System.out.print("\nCash tendered: ");
				cash = input.nextInt();
				input.nextLine();
				if (total > cash) {
					System.out.print("Insufficient funds!!");
				} else {
					change = cash - total;
					System.out.print("Change       : " + String.format("%,.2f", change));

				}

			} else if (chooseitem.equals("2")) {

				System.out.println("\nItem code    : 2");
				System.out.println("Description  : Notebook = 40");
				System.out.print("Quantity     : ");
				quantity = input.nextInt();
				input.nextLine();
				total = quantity * 40;
				System.out.println("Total Amount : " + String.format("%,.2f", total));
				System.out.print("=========================");
				System.out.print("\nCash tendered: ");
				cash = input.nextInt();
				input.nextLine();
				if (total > cash) {
					System.out.print("Insufficient funds!!");
				} else {
					change = cash - total;
					System.out.print("Change       : " + String.format("%,.2f", change));

				}

			} else if (chooseitem.equals("3")) {

				System.out.println("\nItem code    : 3");
				System.out.println("Description  : Eraser = 10");
				System.out.print("Quantity     : ");
				quantity = input.nextInt();
				input.nextLine();
				total = quantity * 10;
				System.out.println("Total Amount : " + String.format("%,.2f", total));
				System.out.print("=========================");
				System.out.print("\nCash tendered: ");
				cash = input.nextInt();
				input.nextLine();
				if (total > cash) {
					System.out.print("Insufficient funds!!");
				} else {
					change = cash - total;
					System.out.print("Change       : " + String.format("%,.2f", change));

				}

			}
			String repeat;

			System.out.print("\nBuy another item? 1-Yes; 2-No: ");
			repeat = input.nextLine();
			if (repeat.equals("1")) {

			} else if (repeat.equals("2")) {
				break;
			}

		} while (true);

		System.out.print("\nThank you, have a good day! ^.^");

	}

}
