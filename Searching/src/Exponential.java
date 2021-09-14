import java.util.Scanner;

public class Exponential {
	static int arr[] = { 10, 20, 40, 80, 90 };
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number want to search ");
		int x = scan.nextInt();
		int size = 1;
		int found = 0;
		while (size < arr.length && found == 0) {
			if (arr[size - 1] == x) {
				System.out.println("Found at pos " + (size - 1));
				found = 1;
			}
			else if (arr[size-1]<x) {
				int r = 2*size-1;
				for(int l=size;l<r;l++) {
					if(arr[l]==x) {
						System.out.println("Found at pos " + l);
						found = 1;
						l=r;
					}
				}
			}
			size=size*2;
		}

	}

}
