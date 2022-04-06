import java.util.*;

public class RECURSIONPART {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] ages = {45, 23, 32, 19, 33, 56};

	    System.out.print("Enter a value -->  ");
	    int value = input.nextInt();

	    if (containsInput(ages, 0, value)) {
	        System.out.println("Value is in the list.");
	    } else {
	        System.out.println("Value is not in the list");
	    }
	}
		
	static boolean containsInput(int[] ages, int x, int value) {
	    if (x < ages.length) {
	        if (ages[x] == value)
	            return true;
	        else
	            return containsInput(ages, x + 1, value);
	    }
	    return false;
	}
	
}

// RECURSION ---- RECURSION ---- RECURSION ---- RECURSION ---- RECURSION ---- RECURSION ----
