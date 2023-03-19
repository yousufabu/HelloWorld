package HelloJava;

public class Arrays_Multi_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multi dimantion 0 1
		int[][] arr = { { 2, 5, 7 }, { 10, 20, 50 } };
		// System.out.println(arr[0][2]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				

			System.out.println(arr[i][j]);
			}
		}

	}

}
