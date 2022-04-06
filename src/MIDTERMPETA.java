import java.text.DecimalFormat;
import java.util.*;

public class MIDTERMPETA {
	
	
	

	public static void main (String[] args) {
		
		double  RPH, HW, OT;
		String name, choose = "";
		String ans = "1";
		
		
	do {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("\n[~~~~~Employee Payroll System~~~~~]\n\n");
		
		System.out.print("\tEnter employee name: ");
		name = input.nextLine();
		
		
		System.out.print("\n[~~Choose F for full-time or P for part-time~~]\n\n");
		System.out.print("Enter choice here -> ");
		 choose = input.nextLine();
		 
		
		if (choose.equals("F") || choose.equals("f")){
			
			System.out.println("\n[~~~Full time employee~~~]\n");
			System.out.print("Enter basic pay -> ");
			double basicpay = input.nextDouble();
			input.nextLine();
			
			
			System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("");
			System.out.println("Name of employee:" + name);
			System.out.println("Your Basic pay is: Php " + String.format("%,.2f", basicpay));
			System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
		    System.out.println("Your grosspay is -> Php " +  String.format("%,.2f", basicpay));
			
			
		}else if (choose.equals("P") || choose.equals("p")) {
			
			System.out.println("\n[~~~Part-time employee~~~]\n");
			System.out.print("Enter rate per hour -> ");
		    RPH = input.nextInt();
		    input.nextLine();
			System.out.print("\nEnter no. of hours worked -> ");
		    HW = input.nextInt();
		    input.nextLine();
		    System.out.print("Enter no. of over time -> ");
		    OT = input.nextInt();
		    input.nextLine();
		    
		    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		    System.out.println("\nEmployee name -> " + name);
		    double basicpay;
		    basicpay = RPH*HW;
		    System.out.println("Your basic pay is -> " + basicpay);
		    
		    
		    double OTpay = OT*RPH*0.15;
		    System.out.println("Your Over time pay is -> " + OTpay);
		    
		  
		    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		    System.out.println("");
		    double grosspay = basicpay+OTpay;
		    System.out.println("Your grosspay is -> Php " + grosspay);
			
		
		}
			System.out.println("\nDo you want another transaction? [1]- YES; [2]- NO");
			System.out.print("Enter option here -> ");
				ans = input.nextLine();
				

		
		}while (ans.equals("1"));
			
			System.out.println("\nThank you! ♥ Have a good day! ");
	
		
	}


	

}

