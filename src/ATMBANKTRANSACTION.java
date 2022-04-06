import java.util.*;

public class ATMBANKTRANSACTION {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String PIN = "123456", tempPIN, option;
		double BAL = 10000, deposit, withdraw;
		int repeat;
		
		System.out.println("Welcome to ABC Bank of Commerce!");
		System.out.print("\nEnter your PIN: ");
		tempPIN = input.nextLine();

		do {
			
			input = new Scanner(System.in);
			if (tempPIN.equals(PIN)) {
			
				System.out.print("\n++++++++++++++++++++++++");
				System.out.println("\nABC Bank of Commerce");
				System.out.println("1. Balance Inquiry");
				System.out.println("2. Deposit");
				System.out.println("3. Withdrawal");
				System.out.print("++++++++++++++++++++++++");

				System.out.print("\nSelect a Transaction: ");
				option = input.nextLine();
				
				if (option.equals("1")) {

					System.out.println("Your current balance is: " + String.format("%,.2f ", BAL));
					System.out.println("++++++++++++++++++++++++");

				} else if (option.equals("2")) {

					System.out.print("Enter amount to deposit: ");
					deposit = input.nextDouble();
					BAL = BAL + deposit;
					System.out.println("Your current balance is: " + String.format("%,.2f ", BAL));
					System.out.println("++++++++++++++++++++++++");

				} else if (option.equals("3")) {
					System.out.print("\nEnter amount to Withdraw: ");
					withdraw = input.nextDouble();
					if (withdraw > BAL) {
						System.out.println("Insufficient fund!");
					}else {
						BAL =BAL - withdraw;
						System.out.println("Your current balance is: " + String.format("%,.2f ", BAL));
						System.out.println("++++++++++++++++++++++++");
						
					}
					
				}
				
			}else {
				System.out.println("Invalid PIN!");
			}
				
		System.out.print("\nDo you want another transaction? 1-Yes; 2-No: ");
		repeat = input.nextInt();
					
		}while (repeat == 1);
				System.out.println("Thank you have a Good day!");
		

		}
	}