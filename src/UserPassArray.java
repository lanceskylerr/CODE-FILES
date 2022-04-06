import java.util.*;

public class UserPassArray {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String[] Usernames = { "One", "Two", "Three", "Four", "Five", "Six" };
		String[] Password = { "1", "2", "3", "4", "5", "6"};

		System.out.print("Enter Username: ");
		String username = input.nextLine();

		System.out.print("Enter Password: ");
		String passID = input.nextLine();

		

		for (int i = 0; i < Usernames.length; i++) {
			if (!Arrays.asList(Usernames).contains(username) && !Arrays.asList(Password).contains(passID)) {
				System.out.println("Username and password not found!");
				break;
			} else {
				if (Usernames[i].equalsIgnoreCase(username) && Password[i].equalsIgnoreCase(passID)) {
					System.out.println("Welcome to our system!");
					break;
				}
			}
			if (Arrays.asList(Usernames).indexOf(username.substring(0, 1).toUpperCase()
					+ username.substring(1)) != Arrays.asList(Password).indexOf(passID)) {
				System.out.println("Username and password mismatch!");
				break;
			}
		}

	}

}