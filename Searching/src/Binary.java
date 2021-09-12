import java.util.Scanner;

public class Binary {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static Scanner scan = new Scanner(System.in);
	static int x;

	public static void main(String[] args) {
		System.out.println("Enter a number you want to search");
		x = scan.nextInt();
		Search(x, 0, arr.length);
	}

	public static void Search(int x, int l, int r) {
		int m = l + (r - l) / 2;
		if (x == arr[m]) {
			System.out.println("Found at position " + m);
		} else if (x < arr[m]) {
			r = m - 1;
			Search(x, l, r);
		} else {
			l = m + 1;
			Search(x, l, r);
		}
	}
}
