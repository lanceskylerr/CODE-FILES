import java.util.*;

public class SESSION {

	public static void main(String[] args) {

		int a[][] = { { 0, 1, 2, 3 }, // index 0
				{ 4, 5, 6, 7 }, // index 1
				{ 8, 9, 10, 11 } };// index 2

//		System.out.println(a[2][0]);
//		System.out.println(a[2][1]);
//		System.out.println(a[2][2]);
//		System.out.println(a[2][3]);
//		System.out.println("-------------------");

//		for (int i = 0; i < 4; i++) {
		// System.out.println(a[2][i]);

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 4; y++) {

				System.out.println(a[x][y]);

			}
		}
	}
}
