import java.util.*;

public class ITERATIVEPART {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] ages = { 45, 23, 32, 19, 33, 56 };

		boolean sample = false;
		System.out.print("Enter a value --> ");
		int value = input.nextInt();

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] == value) {
				sample = true;
				break;
			}
		}

		if (sample) {
			System.out.println("Value is in the list.");
		} else {
			System.out.println("Value is not in the list");
		}
	}
}

//// ITERATION ---- ITERATION ---- ITERATION ---- ITERATION ---- ITERATION ---- ITERATION ----