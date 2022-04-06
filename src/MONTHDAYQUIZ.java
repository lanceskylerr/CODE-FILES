import java.util.*;

public class MONTHDAYQUIZ {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
 // id = index
		
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String[] days = { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", };

		System.out.print("Month: ");
		int monthID = input.nextInt();
		if (monthID > 12 || monthID < 1) {

			System.out.println("Out of bounds!!");

		} else {
			System.out.print("Day: ");
			int dayID = input.nextInt();

			if (dayID > 7 || dayID < 1) {

				System.out.println("Out of bounds!!");
			} else {
			
				System.out.println(monthID + ":" + " The month is " + months[monthID]);
				System.out.println(dayID + ":" + " The day is " + days[dayID]);
			}

		}

	}
}
