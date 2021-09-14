import java.util.Scanner;

public class Jump {

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	static int block = (int) Math.floor(Math.sqrt(arr.length));
	static int l = 0;
	static int r = block - 1;
	static Scanner scan = new Scanner(System.in);
	static int find;

	public static void main(String[] args) {
		System.out.println("Please enter an element");
		find = scan.nextInt();
		jump(find);

	}

	public static void jump(int f) {
		int found = 0;
		while (found == 0) {
			if (arr[r] == find) {
				System.out.println("Find element at position " + r);
				found = 1;
			} else if (arr[r] > find) {
				for (int j = l; j < r; j++) {
					if (arr[j] == find) {
						System.out.println("Find element at position " + j);
						found = 1;
						j = r;
					}
				}
			} else {
				l = r + 1;
				r = r + 3;
				if (r >= arr.length) {
					for (int j = l; j < arr.length; j++) {
						if (arr[j] == find) {
							System.out.println("Find element at position " + j);
							found = 1;
							j = arr.length;
						}
					}
				}
			}
		}
	}
}
