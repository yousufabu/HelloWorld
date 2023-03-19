package HelloJava;

public class February_20_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num1 = 40;
		int num2 = 20;
		int num3 = 30;

		/*if (num1 < num2) {
			System.out.println("number 1 is more than number 2");
			if (num2 < num3) {
				System.out.println("number 2 is more than number 3 too");
			} else {
				System.out.println("ll");
			}
		} else {
			System.out.println("nothing is match");
		}
**/
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		if (num1>num2) {
			System.out.println("1. Num1>num2");
		}
		else {
			System.out.println("2. Num1<num2");
		}
		
		 String result = (num1>num2) ? "num1>num2" : "num1<num2";
		
		System.out.println(result);
	}

}
