package HelloJava;

import java.util.Scanner;

public class Arrays_22_Feb {

	public static void main(String[] args) {
		TakingAnArrayOfInt();

	}

	public static void TakingAnArrayOfInt() {

		int[] arr = new int[9];

		System.out.println("Enter " + arr.length + " integer elements");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

			if (i == 0) {
				System.out.print(arr[i] + ",");

			} else if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");

			}

		}
	}
}
