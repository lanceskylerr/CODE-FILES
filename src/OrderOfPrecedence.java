import java.util.*;

public class OrderOfPrecedence {
	
	public static void main(String[] args) {
		
		System.out.println(5 / 2 + 4 - 2 * 7 % 3);
//		(5 / 2) + 4 - (2 * 7 % 3)
//		2 + 4 - (14 % 3)
//		2 + 4 - (2)
//		2 + 4 - 2
//		6 - 2
//		4
		
		System.out.println(5.0 / 2 + 4 - 2 * 7 % 3);
//		(5.0 / 2 + 4 - 2 * 7 % 3)
//		(5.0 / 2) + 4 - (2 * 7 % 13)
//		2.5 + 4 - (14 % 3)
//		2.5 + 4 - (2)
//		2.5 + 4 - 2
//		6.5 - 2
//		4.5
		
		System.out.println(17 - 5 * 4 / 10 * 5 / 2);
//		(17 - 5 * 4 / 10 * 5 / 2)
//		17 - (5 * 4 / 10 * 5 / 2)
//		17 - (20 / 10 * 5 / 2)
//		17 - (2 * 5 / 2)
//		17 - (10 / 2)
//		17 - (5)
//		12
		
	}

}
