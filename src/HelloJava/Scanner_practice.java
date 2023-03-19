package HelloJava;

import java.util.Scanner;

public class Scanner_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner abc = new Scanner(System.in); 
	
		
		 System.out.println("Enter a number");
		

		 
		 int efg=abc.nextInt();

		
		int a =9;
		int b =99;
		int c = 999;
		int d = 9999;
		
		if ( efg<=a) {
			System.out.println("you've entered  single number");
		}
		else if (efg<=b) {
			System.out.println("you've entered double mumber");
		}
		else if (efg<=c) {
			System.out.println("you've entered triple number");
		}
		else if (efg<=d) {
			System.out.println(" you've entered 4 dgt number");
		}
		else {
			System.out.println("you've entered excedded number");
		}
		
		
		
		
		
		
	}

}
