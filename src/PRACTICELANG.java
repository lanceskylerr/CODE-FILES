import java.util.*;

public class PRACTICELANG {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Product 1: Iphone XI ");
		System.out.print("\nPrice: $75,000.00");

		System.out.print("\n\nProduct 2: Samsung Note 20 ");
		System.out.print("\nPrice: $76,000.00");

		System.out.print("\n\nProduct 3:Xiaomi Black shark ");
		System.out.println("\nPrice: $35,000.00");

		System.out.println("\n======================");
		System.out.println("Input of Payment Terms");
		System.out.println("======================");

		System.out.println("\nCash Discount:");
		System.out.println("10% discount for cash");

		System.out.println("\n3 months Installment:");
		System.out.println("5% Interest for 3 months Installment");

		System.out.println("\n6 months Installment:");
		System.out.println("10% Interest for 6 months Installment");

		System.out.println("\n12 months Installment:");
		System.out.println("20% Interest for 12 months Installment");

		System.out.println("\n=========== Main Menu ==========");
		System.out.println("Press I for Iphone 13");
		System.out.println("Press S for Samsung note 20");
		System.out.println("Press X for Xiaomi black shark");
		System.out.println("================================");
		System.out.print("\nEnter ITEM: ");
		String item = input.nextLine();
		
		double [] prices = { 75000, 76000, 35000};
		String [] items = {"IPhone XI", "Samsung note 20", "Xiaomi black shark"};
		int option = -1;

		if (item.equalsIgnoreCase("I")) {
			option = 0;
			System.out.print("\nYour item is Iphone11");
			System.out.print("\nPrice: $75,000.00");
			
		} else if (item.equalsIgnoreCase("S")) {
			option = 1;
			System.out.print("\nYour item is Samsung note 20");
			System.out.print("\nPrice: $76,000.00");
			
		} else if (item.equalsIgnoreCase("X")) {
			option = 2;
			System.out.print("\nYour item is Xiaomi black shark");
			System.out.println("\nPrice: $35,000.00");
		}
		
		System.out.println("\n\n=========== Select Mode of Payment ==========");
		System.out.println("Press 1: Cash                          10% Discount");
		System.out.println("Press 2: 3 months Installment          5% Discount");
		System.out.println("Press 3: 6 months Installment          10% Discount");
		System.out.println("Press 4: 12 months Installment         20% Discount");
		System.out.println("=============================================");
		
		System.out.print("\nEnter Mode of Payment: ");
		double payment = input.nextDouble();
		
		if (payment == 1) {
			
			System.out.println("Mode of Payment: Cash");
			System.out.println("Item: " + items[option]);
			System.out.println("Price: " + String.format("$%,.2f",prices[option]));
			double discount = prices[option]*0.10;
			System.out.println("Discount Interest: " + String.format("$%,.2f",discount));
			double total = prices[option] + discount;
			System.out.println("Total amount: " + String.format("$%,.2f", total));
			
		}else if (payment == 2) {
			
			System.out.println("Mode of Payment: 3 months Installment");
			System.out.println("Item: " + items[option]);
			System.out.println("Price: " + String.format("$%,.2f",prices[option]));
			double discount = prices[option]*0.05;
			System.out.println("Discount Interest: " + String.format("$%,.2f",discount));
			double total = prices[option] + discount;
			System.out.println("Total amount: " + String.format("$%,.2f", total));
			
		}else if (payment == 3) {

			System.out.println("Mode of Payment: 6 months Installment");
			System.out.println("Item: " + items[option]);
			System.out.println("Price: " + String.format("$%,.2f",prices[option]));
			double discount = prices[option]*0.10;
			System.out.println("Discount Interest: " + String.format("$%,.2f",discount));
			double total = prices[option] + discount;
			System.out.println("Total amount: " + String.format("$%,.2f", total));
			
		}else if (payment == 4) {
			
			System.out.println("Mode of Payment: 12 months Installment");
			System.out.println("Item: " + items[option]);
			System.out.println("Price: " + String.format("$%,.2f",prices[option]));
			double discount = prices[option]*0.20;
			System.out.println("Discount Interest: " + String.format("$%,.2f",discount));
			double total = prices[option] + discount;
			System.out.println("Total amount: " + String.format("$%,.2f", total));
			
		}
		
	}
}
