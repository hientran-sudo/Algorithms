import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to search for");
		int x = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println("Found number at " + i + " position");
			} 
			else if (i == arr.length-1) {
				System.out.println("Number is not in the array");
			}
		}
	}
}
