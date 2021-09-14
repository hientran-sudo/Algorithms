import java.util.Scanner;

public class Interpolation {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static int l = 0;
	static int h = arr.length - 1;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number to search ");
		int x = scan.nextInt();
		int pos = l + (x - arr[l]) * (h - l) / (arr[h] - arr[l]);
		System.out.println("Number at position " + pos);
	}
}
