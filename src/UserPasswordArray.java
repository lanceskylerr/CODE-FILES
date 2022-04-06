import java.util.*;

public class UserPasswordArray {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String[] Usernames = { "One", "Two", "Three", "Four", "Five", "Six" };
		int[] Password = { 1, 2, 3, 4, 5, 6 };

		System.out.print("Enter Username: ");
		String username = input.nextLine();

		System.out.print("Enter Password: ");
		String password = input.nextLine();

		String[] strPassword = new String[Password.length];

		for (int i = 0; i < Password.length; i++) {
			strPassword[i] = String.valueOf(Password[i]);
		}

		for (int i = 0; i < Usernames.length; i++) {
			if (!Arrays.asList(Usernames).contains(username) && !Arrays.asList(strPassword).contains(password)) {
				System.out.println("Username and password not found!");
				break;
			} else {
				if (Usernames[i].equalsIgnoreCase(username) && strPassword[i].equalsIgnoreCase(password)) {
					System.out.println("Welcome to our system!");
					break;
				}
			}
			if (Arrays.asList(Usernames).indexOf(username.substring(0, 1).toUpperCase()
					+ username.substring(1)) != Arrays.asList(strPassword).indexOf(password)) {
				System.out.println("Username and password mismatch!");
				break;
			}
		}

	}

}