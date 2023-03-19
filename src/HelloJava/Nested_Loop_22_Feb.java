 package HelloJava;

public class Nested_Loop_22_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		for (int i=1; i<=2; i++ ) {
		int j=1;
		while (j<=3) {
			for (int x=1; x<=3; x++) {
				System.out.println(" value-I "+i + " Value-J "+j+ " Value-X" +x);
				count++;
			}
			j++;
				
				
		}
		
		
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
