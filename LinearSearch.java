package searchingAlgo;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 5, 3, 9, 10, 8, 1, 4, 7, 6 };
		System.out.println("Enter the element to be search");
		int key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("Element found" + arr[i] + "at index " + (i + 1));
				System.exit(0);
			}

		}
		{
			System.out.println("Element not found");
		}

	}

}
