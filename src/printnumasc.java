import java.util.Scanner;

public class printnumasc {

	public static void main(int num) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input Number: ");
		num = input.nextInt();

		if (num == 0) {
			return;

		} else {
			System.out.println(num);
			System.out.println(num + 1);

		}

	}

}
